package com.softWalter.hr.user.presentations.controller;

import com.softWalter.hr.user.doumain.usecase.UseCaseUser;
import com.softWalter.hr.user.presentations.controller.dto.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    private UseCaseUser useCaseUser;

    public UserController(UseCaseUser useCaseUser) {
        this.useCaseUser = useCaseUser;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponse> findById (@PathVariable Long id) {

        UserResponse user = useCaseUser.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<UserResponse> findByEmail (@RequestParam String email) {

        UserResponse user = useCaseUser.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
