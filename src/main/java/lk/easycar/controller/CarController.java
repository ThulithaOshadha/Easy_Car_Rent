package lk.easycar.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {
    public CarController(){
        System.out.println("car");
    }
}
