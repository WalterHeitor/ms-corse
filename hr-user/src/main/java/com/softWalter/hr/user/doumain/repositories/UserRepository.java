package com.softWalter.hr.user.doumain.repositories;

import com.softWalter.hr.user.doumain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
