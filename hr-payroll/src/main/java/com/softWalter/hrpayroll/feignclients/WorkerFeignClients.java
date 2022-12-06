package com.softWalter.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(
        name = "hr-worker",
        url = "http://localhost:8081/",
        path = "/sotWalter/v1/workers")
public interface WorkerFeignClients {
}
