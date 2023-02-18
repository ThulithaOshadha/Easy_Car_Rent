package lk.easycar.service;

import lk.easycar.dto.CustomerDTO;

public interface CustomerService {
    public void saveCustomer(CustomerDTO dto);
    public void deleteCustomer(String id);
}
