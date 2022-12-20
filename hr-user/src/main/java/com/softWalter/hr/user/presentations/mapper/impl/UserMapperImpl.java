package com.softWalter.hr.user.presentations.mapper.impl;

import com.softWalter.hr.user.doumain.entities.User;
import com.softWalter.hr.user.presentations.controller.dto.UserResponse;
import com.softWalter.hr.user.presentations.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponse userToUserResponse(User user) {
        return new UserResponse(user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getRoles());
    }
}
