package lk.easycar.controller;

import lk.easycar.dto.CustomerDTO;
import lk.easycar.service.CustomerService;
import lk.easycar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

public class CustomerController {
    @Autowired
    private CustomerService service;

    public ResponseUtil addCustomer(@ModelAttribute CustomerDTO dto){
        service.saveCustomer(dto);
        return new ResponseUtil("ok","successfully registered",null);
    }
}
