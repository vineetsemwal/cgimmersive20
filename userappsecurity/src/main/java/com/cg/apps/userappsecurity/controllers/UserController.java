package com.cg.apps.userappsecurity.controllers;

import com.cg.apps.userappsecurity.dto.AddUserRequest;
import com.cg.apps.userappsecurity.dto.UserDetails;
import com.cg.apps.userappsecurity.entities.User;
import com.cg.apps.userappsecurity.service.IUserService;
import com.cg.apps.userappsecurity.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserUtil userUtil;

    @PostMapping("/p/users/add")
    public UserDetails register(@RequestBody @Valid AddUserRequest requestData){
        User user=new User(requestData.getUsername(),requestData.getPassword(),requestData.getRoles());
        user= userService.register(user);
        UserDetails userDetails=userUtil.toUserDetails(user);
        return userDetails;
    }



}
