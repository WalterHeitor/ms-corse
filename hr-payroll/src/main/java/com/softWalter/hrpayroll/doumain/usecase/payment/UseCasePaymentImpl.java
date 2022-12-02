package com.softWalter.hrpayroll.doumain.usecase.payment;

import com.softWalter.hrpayroll.doumain.model.Payment;
import com.softWalter.hrpayroll.doumain.usecase.UseCasePayment;
import org.springframework.stereotype.Service;

@Service
public class UseCasePaymentImpl implements UseCasePayment {


    @Override
    public Payment getPayment(long workerId, int days) {
        return new Payment("Walter", 200.0, days);
    }
}
