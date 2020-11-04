package com.cg.apps.userappsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(encodePassword());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.csrf().disable().httpBasic().and().authorizeRequests().
            antMatchers("/p/**").permitAll().
               antMatchers("/").permitAll().
               antMatchers("/c/**").authenticated().
               antMatchers("/m/**").hasAnyRole("MANAGER","ADMIN")
               .antMatchers("/a/**").hasAnyRole("ADMIN")
               .and().formLogin().permitAll().
               and().logout().deleteCookies("JSESSIONID");

    }

    @Bean
    public PasswordEncoder encodePassword(){
       PasswordEncoder encoder= NoOpPasswordEncoder.getInstance();
       return encoder;
    }
}
