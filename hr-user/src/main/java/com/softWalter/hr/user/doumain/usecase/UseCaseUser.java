package com.softWalter.hr.user.doumain.usecase;

import com.softWalter.hr.user.presentations.controller.dto.UserResponse;

public interface UseCaseUser {
    UserResponse findById(Long id);

    UserResponse findByEmail(String email);
}
