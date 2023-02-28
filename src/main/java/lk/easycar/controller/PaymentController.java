package lk.easycar.controller;

import lk.easycar.dto.PaymentDTO;
import lk.easycar.service.PaymentService;
import lk.easycar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    private PaymentService service;
    @PostMapping
    public ResponseUtil savePayment(@RequestBody PaymentDTO dto){
        service.savePayment(dto);
        return new ResponseUtil("ok","payment saved",null);
    }
    public ResponseUtil getAllPayment(){
        return new ResponseUtil("ok","",service.getAllPayments());
    }
}
