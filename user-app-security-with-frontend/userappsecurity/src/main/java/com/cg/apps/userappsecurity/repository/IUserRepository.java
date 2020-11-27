package com.cg.apps.userappsecurity.repository;

import com.cg.apps.userappsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
}
