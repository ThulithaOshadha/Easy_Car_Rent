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
    @GetMapping
    public ResponseUtil getAllBookings(){
        return new ResponseUtil("ok","",service.getAllBooking());
    }
    public ResponseUtil updateBooking(@RequestBody BookingDTO dto){
        service.updateBooking(dto);
        return new ResponseUtil("ok","updated booking",null);
    }
}
