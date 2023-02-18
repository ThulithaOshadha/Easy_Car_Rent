package lk.easycar.config;

import lk.easycar.advisor.AppWideExceptionHandler;
import lk.easycar.controller.CarController;
import lk.easycar.controller.DriverController;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {CarController.class, DriverController.class, AppWideExceptionHandler.class})
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("web app");
    }


}
