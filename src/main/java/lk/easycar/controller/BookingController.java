package lk.easycar.controller;

import lk.easycar.dto.BookingDTO;
import lk.easycar.service.BookingService;
import lk.easycar.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {
    @Autowired
    private BookingService service;

    @PostMapping
    public ResponseUtil addBooking(@RequestBody BookingDTO dto){
        service.addBooking(dto);
        return new ResponseUtil("ok","",null);
    }
}
