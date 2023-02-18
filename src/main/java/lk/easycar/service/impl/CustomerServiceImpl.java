package lk.easycar.service.impl;

import lk.easycar.dto.CustomerDTO;
import lk.easycar.repo.CustomerRepo;
import lk.easycar.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveCustomer(CustomerDTO dto) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
