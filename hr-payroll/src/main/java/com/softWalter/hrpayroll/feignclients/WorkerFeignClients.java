package com.softWalter.hrpayroll.feignclients;

import com.softWalter.hrpayroll.presentation.dto.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(
        name = "hr-worker"
        )
//,url = "http://localhost:8081"
//        path = "/sotWalter/v1/workers")
//@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface WorkerFeignClients {

//    @GetMapping(value = "/{id}")
//    ResponseEntity<Worker> findById(@PathVariable(value = "id") Long id);

    @RequestMapping(method = RequestMethod.GET, value = "/sotWalter/v1/workers/{id}", consumes = "application/json")
    ResponseEntity<Worker> findById(@PathVariable(value = "id") Long id);

}
