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

    @PutMapping
    public ResponseUtil updateBooking(@RequestBody BookingDTO dto){
        service.updateBooking(dto);
        return new ResponseUtil("ok","updated booking",null);
    }
    @DeleteMapping(params = {"bookingID"})
    public ResponseUtil deleteBooking(@RequestParam String bookingID){
        service.deleteBooking(bookingID);
        return new ResponseUtil("ok","successfully deleted booking",null);
    }

    @GetMapping(params = {"accepted"})
    public ResponseUtil searchBookingFromIsAccepted(String accepted){
        System.out.println("booking controler");
        return new ResponseUtil("ok","",service.searchBookingByAccepted(accepted));
    }
    @PutMapping(params = {"bookingID"})
    public ResponseUtil updateBookingAccepted(String bookingID){
        System.out.println(bookingID);
        service.updateAcceptedBooking(bookingID);
        return new ResponseUtil("ok","update accepted",null);
        //return new ResponseUtil("ok","",service.updateAcceptedBooking(bookingID));
    }

    @GetMapping(params = {"driver_license"})
    public ResponseUtil findByBookingsByDriverID(String driver_license){
        return new ResponseUtil("ok","",service.findBookingsByDriver_License(driver_license));
    }
    @GetMapping(params = {"count"})
    public ResponseUtil finBookingCount(){
        return new ResponseUtil("ok","",service.getBookingCount());
    }
};
