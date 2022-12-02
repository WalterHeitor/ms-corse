package com.softWalter.hrpayroll.presentation.payment;

import com.softWalter.hrpayroll.doumain.model.Payment;
import com.softWalter.hrpayroll.doumain.usecase.UseCasePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/softWalter/v1/payments")
public class PaymentController {

    @Autowired
    private UseCasePayment useCasePayment;

    @GetMapping(value = "{workerId}/days/{day}")
    public ResponseEntity<Payment> getPayment(
            @PathVariable Long workerId,
            @PathVariable Integer day) {

        return ResponseEntity.ok(useCasePayment.getPayment(workerId, day));
    }

}
