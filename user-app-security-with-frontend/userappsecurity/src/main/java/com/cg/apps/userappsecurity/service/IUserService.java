package com.cg.apps.userappsecurity.service;

import com.cg.apps.userappsecurity.entities.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface IUserService {

   User findById(Long id);

   User register(User user);

   User update(User user);

   User findByUsername(String username)throws UsernameNotFoundException;
}
