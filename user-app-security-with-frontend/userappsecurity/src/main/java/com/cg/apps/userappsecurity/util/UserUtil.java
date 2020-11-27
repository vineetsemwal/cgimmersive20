package com.cg.apps.userappsecurity.util;

import com.cg.apps.userappsecurity.dto.UserDetails;
import com.cg.apps.userappsecurity.entities.User;
import org.springframework.stereotype.Component;


@Component
public class UserUtil {

    public UserDetails toUserDetails(User user){
        UserDetails userDetails=new UserDetails(user.getId(),user.getUsername(),user.getPassword(),user.getRoles());
        return userDetails;
    }
}
