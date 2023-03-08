package lk.easycar.controller;

import lk.easycar.dto.CarDTO;
import lk.easycar.service.CarService;
import lk.easycar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping
    public ResponseUtil saveCar(@ModelAttribute CarDTO dto/*, @ModelAttribute MultipartFile img*/){


        service.saveCars(dto);
        return new ResponseUtil("ok","successfully added",null);
    }
    @GetMapping
    public ResponseUtil getAllCars(){
        System.out.println("get all cars");
        return new ResponseUtil("ok","successfully loaded",service.getAllCars());

    }
    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDTO dto){
        service.updateCars(dto);
        return new ResponseUtil("ok","successfully updated",null);
    }
    @DeleteMapping(params = {"vehicleNum"})
    public ResponseUtil deleteCar(@RequestParam String vehicleNum){
        service.deleteCar(vehicleNum);
        return new ResponseUtil("ok","successfully deleted",null);
    }

    @GetMapping(path = "/{vehicleNum}")
    public ResponseUtil searchCarWithVehicleNum(@PathVariable String vehicleNum){
        System.out.println("controller : "+vehicleNum);
        return new ResponseUtil("ok","",service.searchCarWithVehicleNum(vehicleNum));
    }
    @GetMapping(path = "/{vehicleType}")
    public ResponseUtil searchCarWithVehicleType(@PathVariable String vehicleType){
        System.out.println("controller : "+vehicleType);
        return new ResponseUtil("ok","",service.searchCarWithVehicleType(vehicleType));

    }


}
