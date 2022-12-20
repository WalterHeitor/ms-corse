package com.softWalter.hroauth.dataprovider.feingclients;

import com.softWalter.hroauth.dataprovider.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UsersFeingClients {

    @GetMapping(value = "/search")
    ResponseEntity<UserResponse> findByEmail (@RequestParam String email);
}
