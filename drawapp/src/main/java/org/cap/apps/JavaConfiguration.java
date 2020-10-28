package org.cap.apps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:shape.properties")
@ComponentScan("org.cap.apps")
@Configuration
public class JavaConfiguration {

    
}
