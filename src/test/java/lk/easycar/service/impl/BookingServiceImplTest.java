package lk.easycar.service.impl;

import lk.easycar.config.WebRootConfig;
import lk.easycar.entity.Booking;
import lk.easycar.repo.BookingRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration  //create  testing conterx
@ContextConfiguration(classes = {WebRootConfig.class}) //configuration add krnwa context ekata
@ExtendWith(SpringExtension.class) //junit ekk intrigarate kranne meke
@Transactional
class BookingServiceImplTest {

    @Autowired
    private BookingRepo repo;
    @Test
    void addBooking() {
    }

    @Test
    void updateBooking() {
    }

    @Test
    void deleteBooking() {
    }

    @Test
    void getAllBooking() {
    }

    @Test
    void searchBookingByAccepted() {
        Booking aTrue = repo.findBookingsByAcceptedEquals("false");
        System.out.println(aTrue);
    }
}