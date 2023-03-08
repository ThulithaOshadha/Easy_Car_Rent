package lk.easycar.service;

import lk.easycar.dto.BookingDTO;
import lk.easycar.entity.Booking;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;


public interface BookingService {
    public void addBooking(BookingDTO dto);
    public void updateBooking(BookingDTO dto);
    public void deleteBooking(String bookingID);
    public ArrayList<BookingDTO> getAllBooking();

    public BookingDTO searchBookingByAccepted(String type);
    public void updateAcceptedBooking(String id);
    public BookingDTO findBookingsByDriver_License(String driverLicense);

    public long getBookingCount();
}
