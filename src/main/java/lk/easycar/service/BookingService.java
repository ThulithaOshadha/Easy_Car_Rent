package lk.easycar.service;

import lk.easycar.dto.BookingDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


public interface BookingService {
    public void addBooking(BookingDTO dto);
}
