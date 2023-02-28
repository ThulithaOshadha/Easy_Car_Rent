package lk.easycar.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lk.easycar.service.impl.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
@ComponentScan(basePackageClasses = {CarServiceImpl.class, BookingServiceImpl.class, DriverServiceImpl.class, CustomerServiceImpl.class, PaymentServiceImpl.class})
public class WebRootConfig {
    public WebRootConfig(){
        System.out.println("web root");
    }

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();

    }

}
