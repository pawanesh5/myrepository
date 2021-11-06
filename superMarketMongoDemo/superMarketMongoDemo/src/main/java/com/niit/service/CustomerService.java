package com.niit.service;

import com.niit.exception.CustomerAlreadyExistsException;
import com.niit.exception.CustomerNotFoundException;
import com.niit.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer saveCustomer(Customer customer) throws CustomerAlreadyExistsException;
    public boolean deleteCustomer(int id) throws CustomerNotFoundException;
    public List<Customer> getAllCustomer();
    public List<Customer> getCustomerByCityName(String city);


}
