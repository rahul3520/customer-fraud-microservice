package com.springCloud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public Boolean isFraudlentCustomer(Integer customerId){

        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFruadster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
