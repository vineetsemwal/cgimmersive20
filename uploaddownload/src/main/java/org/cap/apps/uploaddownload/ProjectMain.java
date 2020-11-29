package org.cap.apps.uploaddownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class ProjectMain {

    public static void main(String args[]) {
        SpringApplication.run(ProjectMain.class, args);

    }


    /**
     *
     * for handling cross origin requests
     */
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource src=new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedHeader("*");
        configuration.addAllowedOrigin("*");
        configuration.addAllowedMethod("*");
        src.registerCorsConfiguration("/**",configuration);
        return new CorsFilter(src);
    }
}
