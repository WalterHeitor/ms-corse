package com.softWalter.hr.user.doumain.usecase.impl;

import com.softWalter.hr.user.doumain.entities.User;
import com.softWalter.hr.user.doumain.repositories.UserRepository;
import com.softWalter.hr.user.doumain.usecase.UseCaseUser;
import com.softWalter.hr.user.presentations.controller.dto.UserResponse;
import com.softWalter.hr.user.presentations.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class UseCaseUserImpl implements UseCaseUser {

    private UserRepository userRepository;
    private UserMapper  userMapper;

    public UseCaseUserImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserResponse findById(Long id) {


        Optional<User> optionalUser = this.userRepository.findById(id);
        UserResponse userResponse = getUserResponse(optionalUser);

        return userResponse;
    }

    private UserResponse getUserResponse(Optional<User> optionalUser) {
        User user = getUser(optionalUser);
        UserResponse userResponse = userMapper.userToUserResponse(user);
        return userResponse;
    }

    private static User getUser(Optional<User> optionalUser) {
        if (optionalUser.isEmpty()) throw new RuntimeException("criar exception");
        User user = optionalUser.get();
        return user;
    }

    @Override
    public UserResponse findByEmail(String email) {

        User user = this.userRepository.findByEmail(email);

        if (user == null) throw new RuntimeException("criar exception");

        return userMapper.userToUserResponse(user);
    }
}
