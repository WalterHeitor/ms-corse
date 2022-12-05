package com.softWalter.hrpayroll.doumain.usecase.payment;

import com.softWalter.hrpayroll.doumain.model.Payment;
import com.softWalter.hrpayroll.doumain.usecase.UseCasePayment;
import com.softWalter.hrpayroll.presentation.dto.WorkerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UseCasePaymentImpl implements UseCasePayment {

    @Value("${hr-worker.host}")
    private String workerHost;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Payment getPayment(long workerId, int days) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);

        WorkerResponse workerResponse =
                restTemplate.getForObject(workerHost + "/sotWalter/v1/workers/{id}",
                        WorkerResponse.class, uriVariables );

        return new Payment(workerResponse.getWorkerName(), workerResponse.getDialyIncome(), days);
    }
}
