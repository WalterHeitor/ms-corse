package com.softWalter.hrpayroll.presentation.payment;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.softWalter.hrpayroll.doumain.model.Payment;
import com.softWalter.hrpayroll.doumain.usecase.UseCasePayment;
import com.softWalter.hrpayroll.presentation.dto.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/softWalter/v1/payments")
public class PaymentController {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private Environment env;

    @Autowired
    private UseCasePayment useCasePayment;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping(value = "{workerId}/days/{day}")
    public ResponseEntity<Payment> getPayment(
            @PathVariable Long workerId,
            @PathVariable Integer day) {

        LOGGER.info("PORT = " + env.getProperty("local.server.port"));

        return ResponseEntity.ok(useCasePayment.getPayment(workerId, day));
    }

    public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer day){
        Payment payment= new Payment("Walter", 1370.0, day);

        return ResponseEntity.ok(payment);
    }

}
