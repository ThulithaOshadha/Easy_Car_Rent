package lk.easycar.controller;

import lk.easycar.dto.DriverDTO;
import lk.easycar.entity.Driver;
import lk.easycar.repo.DriverRepo;
import lk.easycar.service.DriverService;
import lk.easycar.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {
    @Autowired
    private DriverService service;
    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public ResponseUtil addDriver(@ModelAttribute DriverDTO dto){
        service.saveDriver(dto);
        return  new ResponseUtil("ok","successfully updated",null);

    }
}
