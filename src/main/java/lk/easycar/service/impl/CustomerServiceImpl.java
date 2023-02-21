package lk.easycar.service.impl;

import lk.easycar.dto.CustomerDTO;
import lk.easycar.entity.Customer;
import lk.easycar.repo.CustomerRepo;
import lk.easycar.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveCustomer(CustomerDTO dto) {
        repo.save(mapper.map(dto, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Wrong nic..Please Check the nic");
        }
        repo.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (!repo.existsById(dto.getNic())){
            throw new RuntimeException("Wrong nic..Please Check the nic");
        }
        repo.save(mapper.map(dto,Customer.class));
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<CustomerDTO>>(){}.getType());
    }

    @Override
    public CustomerDTO searchCustomerWithNic(String nic) {
        Customer customer = repo.findCustomerByNic(nic);
        if (customer!=null){
            return mapper.map(customer,CustomerDTO.class);
        }
        return null;
    }

    @Override
    public Long countCustomers() {
        long cusCount = repo.count();
        return cusCount;
    }




}
