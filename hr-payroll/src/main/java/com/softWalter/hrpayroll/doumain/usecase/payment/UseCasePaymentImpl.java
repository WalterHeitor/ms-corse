package com.softWalter.hrpayroll.doumain.usecase.payment;


import com.softWalter.hrpayroll.doumain.model.Payment;
import com.softWalter.hrpayroll.doumain.usecase.UseCasePayment;
import com.softWalter.hrpayroll.feignclients.WorkerFeignClients;
import com.softWalter.hrpayroll.presentation.dto.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseCasePaymentImpl implements UseCasePayment {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    @Override
    public Payment getPayment(long workerId, int days) {

        Worker worker =
                workerFeignClients.findById(workerId).getBody();

        return new Payment(worker.getWorkerName(), worker.getDialyIncome(), days);
    }
}
