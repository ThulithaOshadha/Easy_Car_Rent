package lk.easycar.controller;

import lk.easycar.dto.CarDTO;
import lk.easycar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService service;

    public void saveCar(@ModelAttribute CarDTO dto){
        service.saveCars(dto);
    }


}
