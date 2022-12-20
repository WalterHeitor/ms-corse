package com.softWalter.hroauth.usecase;

import com.softWalter.hroauth.dataprovider.dto.UserResponse;

public interface UserCaseUser {

    UserResponse findByEmail(String email);
}
