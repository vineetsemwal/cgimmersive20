package org.cap.apps.studentbootjparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableTransactionManagement
@SpringBootApplication
public class ProjectMain {

    public static void main(String args[]) {
        SpringApplication.run(ProjectMain.class, args);

    }

    @Bean
    public Docket api(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.cap.apps.studentbootjparest"))
                .paths(PathSelectors.any())
                .build();
        return docket;

    }

    public ApiInfo getApiInfo(){
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("student mgt application")
                .description("rest api for student mgt")
                .build();
        return apiInfo;
    }

}
