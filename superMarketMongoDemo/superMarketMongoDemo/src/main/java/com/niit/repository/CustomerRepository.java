package com.niit.repository;

import com.niit.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,Integer>
{
    @Query("{'Address.city':{$in:[?0]}}")
    List<Customer> findCustomerByCity(String city);
}
