package com.cg.apps.userappsecurity.service;

import com.cg.apps.userappsecurity.dto.CustomUserDetails;
import com.cg.apps.userappsecurity.entities.User;
import com.cg.apps.userappsecurity.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User findById(Long id) {
       Optional<User>optional= userRepository.findById(id);
       if(!optional.isPresent()){
       throw new UsernameNotFoundException("user not found for id="+id);
       }
        return optional.get();
    }

    @Override
    public User register(User user) {
       user= userRepository.save(user);
       return user;
    }

    @Override
    public User update(User user) {
        user=userRepository.save(user);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= userRepository.findUserByUsername(username);
        CustomUserDetails details=new CustomUserDetails(user);
        return details;
    }
}
