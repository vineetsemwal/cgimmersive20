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
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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
       http.cors().configurationSource(corsConfigurationSource()).and().csrf().disable().httpBasic().and().authorizeRequests().
            antMatchers("/p/**").permitAll().
               antMatchers("/").permitAll().
               antMatchers("/login").permitAll().
               antMatchers("/c/**").authenticated().
               antMatchers("/m/**").hasAnyRole("MANAGER","ADMIN")
               .antMatchers("/a/**").hasAnyRole("ADMIN")
               .and().formLogin().permitAll().failureForwardUrl("/loginfail").defaultSuccessUrl("/success").
               //failureForwardUrl("/fail").
               and().logout().
               clearAuthentication(true).
               deleteCookies("JSESSIONID").
               invalidateHttpSession(true).logoutSuccessUrl("/logoutsuccess");

    }

    @Bean
    CorsConfigurationSource corsConfigurationSource()
    {
        UrlBasedCorsConfigurationSource src=new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedHeader("*");
        configuration.addAllowedOrigin("*");
        configuration.addAllowedMethod("*");
        src.registerCorsConfiguration("/**",configuration);
        return src;
    }

    @Bean
    public PasswordEncoder encodePassword(){
       PasswordEncoder encoder= NoOpPasswordEncoder.getInstance();
       return encoder;
    }
}
