package com.softWalter.hroauth.presentation.controller;

import com.netflix.discovery.converters.Auto;
import com.softWalter.hroauth.dataprovider.dto.UserResponse;
import com.softWalter.hroauth.usecase.UserCaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserCaseUser userCaseUser;

    @GetMapping(value = "/search")
    public ResponseEntity<UserResponse> findByEmail(@RequestParam String email) {
        UserResponse userResponse = userCaseUser.findByEmail(email);
        return ResponseEntity.ok(userResponse);
    }
}
