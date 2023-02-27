package lk.easycar.controller;

import lk.easycar.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class PaymentController {
    @Autowired
    private PaymentService service;
}
