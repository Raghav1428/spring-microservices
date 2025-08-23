package in.raghavseth.fraud.controllers;

import in.raghavseth.fraud.responses.FraudCheckResponse;
import in.raghavseth.fraud.services.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fraud-check")
@AllArgsConstructor
public class FraudCheckHistoryController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customerId) {
        Boolean isFraudulentCustomer =  fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }

}
