package in.raghavseth.customer.services;

import in.raghavseth.customer.exceptions.EmailAlreadyExistsException;
import in.raghavseth.customer.models.Customer;
import in.raghavseth.customer.repositories.CustomerRepository;
import in.raghavseth.customer.requests.CustomerRegistration;
import in.raghavseth.customer.responses.FraudCheckResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRegistration request) {

        if (customerRepository.existsByEmail(request.email())) {
            throw new EmailAlreadyExistsException("Email already in use");
        }

        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://localhost:8081/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );

        assert fraudCheckResponse != null;
        if(fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("Fraudster");
        }


    }
}
