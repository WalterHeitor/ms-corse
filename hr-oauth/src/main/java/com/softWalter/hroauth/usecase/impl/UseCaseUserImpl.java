package com.softWalter.hroauth.usecase.impl;

import com.softWalter.hroauth.dataprovider.dto.UserResponse;
import com.softWalter.hroauth.dataprovider.feingclients.UsersFeingClients;
import com.softWalter.hroauth.usecase.UserCaseUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UseCaseUserImpl implements UserCaseUser, UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UseCaseUserImpl.class);
    private UsersFeingClients usersFeingClients;

    public UseCaseUserImpl(UsersFeingClients usersFeingClients) {
        this.usersFeingClients = usersFeingClients;
    }

    @Override
    public UserResponse findByEmail(String email) {
        UserResponse userResponse = usersFeingClients.findByEmail(email).getBody();
        if (userResponse == null) {
            logger.error("Usecase - Email not found :" + email);
            throw new IllegalStateException("Email not found");
        }
        logger.info("Usecase - Email found :" + email);
        return userResponse;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserResponse userResponse = usersFeingClients.findByEmail(username).getBody();
        if (userResponse == null) {
            logger.error("Usecase - Email not found :" + username);
            throw new UsernameNotFoundException("Email not found");
        }
        logger.info("Usecase - Email found :" + username);
        return userResponse;
    }
}
