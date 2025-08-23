package in.raghavseth.fraud.services;

import in.raghavseth.fraud.models.FraudCheckHistory;
import in.raghavseth.fraud.repositories.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fcHistoryRepository;


    public Boolean isFraudulentCustomer(Integer customerId) {
        fcHistoryRepository.save(
                FraudCheckHistory.builder()
                        .isFraudster(false)
                        .customerId(customerId)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }

}
