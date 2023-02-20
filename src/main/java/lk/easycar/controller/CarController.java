package lk.easycar.controller;

import lk.easycar.dto.CarDTO;
import lk.easycar.service.CarService;
import lk.easycar.util.ResponseUtil;
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

    @PostMapping
    public ResponseUtil saveCar(@ModelAttribute CarDTO dto){
        service.saveCars(dto);
        return new ResponseUtil("ok","successfully added",null);
    }
    @GetMapping
    public ResponseUtil getAllCars(){
        return new ResponseUtil("ok","successfully loaded",service.getAllCars());

    }


}
