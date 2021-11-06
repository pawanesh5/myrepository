package com.niit.controller;

import com.niit.exception.CustomerAlreadyExistsException;
import com.niit.exception.CustomerNotFoundException;
import com.niit.model.Customer;
import com.niit.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer-service/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private ResponseEntity responseEntity;

    @PostMapping("add")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistsException
    {
        try
        {
            customerService.saveCustomer(customer);
            responseEntity = new ResponseEntity(customer, HttpStatus.CREATED);
        }
        catch (CustomerAlreadyExistsException e)
        {
            throw new CustomerAlreadyExistsException();
        }
        catch (Exception ex)
        {
            responseEntity = new ResponseEntity("Error while addingcustomer data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @DeleteMapping("customer/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") int id) throws CustomerNotFoundException
    {
        try
        {
            customerService.deleteCustomer(id);
            responseEntity = new ResponseEntity("Customer deleted successfully",HttpStatus.OK);
        }
        catch (CustomerNotFoundException e)
        {
            throw  new CustomerNotFoundException();
        }
        catch (Exception ex)
        {
            responseEntity = new ResponseEntity("Error while deleting customer data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("customers")
    public ResponseEntity<?> getAllCustomers()
    {
        try
        {
            responseEntity = new ResponseEntity(customerService.getAllCustomer(),HttpStatus.OK);
        }
        catch (Exception ex)
        {
            responseEntity = new ResponseEntity("Error while fetching customer data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    @GetMapping("customers/{city}")
    public ResponseEntity<?> getCustomerByCity(@PathVariable("city") String city)
    {
        try
        {
          responseEntity = new ResponseEntity(customerService.getCustomerByCityName(city),HttpStatus.OK);
        }
        catch (Exception ex)
        {
            responseEntity = new ResponseEntity("Error while fetching customer data",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
}

