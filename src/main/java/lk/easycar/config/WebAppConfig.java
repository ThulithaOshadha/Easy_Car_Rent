package lk.easycar.config;

import lk.easycar.advisor.AppWideExceptionHandler;
import lk.easycar.controller.CarController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {CarController.class, AppWideExceptionHandler.class})
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("web app");
    }
}
