package in.raghavseth.customer.controllers;

import in.raghavseth.customer.requests.CustomerRegistration;
import in.raghavseth.customer.services.CustomerService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> registerCustomer(
            @Valid @RequestBody CustomerRegistration customerRegistration) throws IllegalAccessException {

        log.info("Registering new customer with email: {}", customerRegistration.email());
        customerService.registerCustomer(customerRegistration);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Customer registered successfully");
    }

}
