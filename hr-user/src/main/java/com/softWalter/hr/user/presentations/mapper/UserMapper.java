package com.softWalter.hr.user.presentations.mapper;

import com.softWalter.hr.user.doumain.entities.User;
import com.softWalter.hr.user.presentations.controller.dto.UserResponse;

public interface UserMapper{
    UserResponse userToUserResponse(User user);
}
