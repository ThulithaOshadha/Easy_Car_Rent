package lk.easycar.service.impl;

import lk.easycar.dto.PaymentDTO;
import lk.easycar.entity.Payment;
import lk.easycar.repo.PaymentRepo;
import lk.easycar.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void savePayment(PaymentDTO dto) {
        repo.save(mapper.map(dto, Payment.class));
    }

    @Override
    public void deleteCars(String id) {

    }

    @Override
    public void updatePayment(PaymentDTO dto) {

    }

    @Override
    public ArrayList<PaymentDTO> getAllPayments() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<PaymentDTO>>(){}.getType());
    }
}
