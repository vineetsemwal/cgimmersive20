package org.cap.apps.studentms;

import org.cap.apps.studentms.dao.StudentDaoImpl;
import org.cap.apps.studentms.ui.ProjectUi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @SpringBootApplication annotation is equal to below three
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)@EnableAutoconfiguration
 */

@SpringBootApplication
public class ProjectMain {
    private static final Logger Log= LoggerFactory.getLogger(ProjectMain.class);

    public static void main(String[] args) {
        Log.info("application started");
        ApplicationContext context = SpringApplication.run(ProjectMain.class, args);
        ProjectUi projectUi=context.getBean(ProjectUi.class);
        projectUi.runUi();
        Log.info("application closed");
    }

}
