package com.sharshov.springeshop.dao;


import com.sharshov.springeshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findFirstByName(String name);
}
