package in.raghavseth.customer.services;

import in.raghavseth.customer.exceptions.EmailAlreadyExistsException;
import in.raghavseth.customer.models.Customer;
import in.raghavseth.customer.repositories.CustomerRepository;
import in.raghavseth.customer.requests.CustomerRegistration;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistration request) throws IllegalAccessException {

        if (customerRepository.existsByEmail(request.email())) {
            throw new EmailAlreadyExistsException("Email already in use");
        }

        Customer customer = Customer.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
