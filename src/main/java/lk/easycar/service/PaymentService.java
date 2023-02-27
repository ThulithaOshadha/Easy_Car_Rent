package lk.easycar.service;

import lk.easycar.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {
    public void savePayment(PaymentDTO dto);
    public void deleteCars(String id);
    public void updatePayment(PaymentDTO dto);
    public ArrayList<PaymentDTO> getAllPayments();
}
