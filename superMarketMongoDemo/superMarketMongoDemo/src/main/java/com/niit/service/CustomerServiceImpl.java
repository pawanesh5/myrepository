package com.niit.service;

import com.niit.exception.CustomerAlreadyExistsException;
import com.niit.exception.CustomerNotFoundException;
import com.niit.model.Customer;
import com.niit.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) throws CustomerAlreadyExistsException {
        if(customerRepository.findById(customer.getCustomerId()).isPresent())
        {
            throw new CustomerAlreadyExistsException();
        }
        return customerRepository.save(customer);
    }


    @Override
    public boolean deleteCustomer(int id) throws CustomerNotFoundException {
        boolean result=false;
        if(customerRepository.findById(id).isEmpty())
        {
            throw new CustomerNotFoundException();
        }
        else
        {
            customerRepository.deleteById(id);
             result=true;
        }
        return result;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getCustomerByCityName(String city)
    {
        return null;
    }
}
