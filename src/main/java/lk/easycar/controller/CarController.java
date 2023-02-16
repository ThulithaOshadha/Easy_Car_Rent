package lk.easycar.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {
    public CarController(){
        System.out.println("car");
    }

    @GetMapping
    public ModelAndView carSave(){
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }

}
