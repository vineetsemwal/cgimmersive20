package com.cg.apps.userappsecurity.controllers;

import com.cg.apps.userappsecurity.dto.AddUserRequest;
import com.cg.apps.userappsecurity.dto.LoginRequest;
import com.cg.apps.userappsecurity.dto.UserDetails;
import com.cg.apps.userappsecurity.entities.User;
import com.cg.apps.userappsecurity.service.IUserService;
import com.cg.apps.userappsecurity.util.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Validated
@RestController
public class UserController {

    private static final Logger Log= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @Autowired
    private UserUtil userUtil;

    @PostMapping("/p/users/add")
    public UserDetails register(@RequestBody @Valid AddUserRequest requestData) {
        User user = new User(requestData.getUsername(), requestData.getPassword(), requestData.getRoles());
        user = userService.register(user);
        UserDetails userDetails = userUtil.toUserDetails(user);
        return userDetails;
    }

    @GetMapping("/c/user/by/username/{username}")
    public UserDetails fetchUser(@PathVariable String username) {
        User user = userService.findByUsername(username);
        UserDetails userDetails = userUtil.toUserDetails(user);
        return userDetails;
    }



    @GetMapping("/success")
    public boolean success(HttpServletRequest request) {
        Log.info("********success");
        HttpSession session = request.getSession(false);
        if (session != null) {
            Log.info("session created, session id=" + session.getId());
        }
        return true;
    }

    @GetMapping("/logoutsuccess")
    public String logoutSuccess(HttpServletRequest request) {
        return "logout done";
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @PostMapping("/loginfail")
    public String loginFail(){
        return "incorrect credentials, login fail";
    }
}
