package lk.easycar.service;

import lk.easycar.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    public void saveCustomer(CustomerDTO dto);
    public void deleteCustomer(String id);
    public void updateCustomer(CustomerDTO dto);
    public ArrayList<CustomerDTO> getAllCustomers();
}
