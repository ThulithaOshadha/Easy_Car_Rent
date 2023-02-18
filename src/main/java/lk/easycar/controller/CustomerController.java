package lk.easycar.controller;

import lk.easycar.dto.CustomerDTO;
import lk.easycar.service.CustomerService;
import lk.easycar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){
        service.saveCustomer(dto);
        return new ResponseUtil("ok","successfully registered",null);
    }
    @GetMapping
    public ResponseUtil getAllCustomer(){
        return new ResponseUtil("ok","successfully loaded",service.getAllCustomers());
    }
    @DeleteMapping
    public ResponseUtil deleteCustomer(@RequestParam String id){
        service.deleteCustomer(id);
        return new ResponseUtil("ok","successfully deleted",null);
    }
    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        service.updateCustomer(dto);
        return new ResponseUtil("ok","successfully updated",null);
    }

}
