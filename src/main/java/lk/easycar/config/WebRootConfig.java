package lk.easycar.config;

import lk.easycar.service.impl.CarServiceImpl;
import lk.easycar.service.impl.DriverServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
@ComponentScan(basePackageClasses = {CarServiceImpl.class, DriverServiceImpl.class})
public class WebRootConfig {
    public WebRootConfig(){
        System.out.println("web root");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
