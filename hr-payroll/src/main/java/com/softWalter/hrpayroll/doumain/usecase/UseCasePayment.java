package com.softWalter.hrpayroll.doumain.usecase;

import com.softWalter.hrpayroll.doumain.model.Payment;

public interface UseCasePayment {

    Payment getPayment(long workerId, int days);

}
