package com.niit.bookticketservice.repository;

import com.niit.bookticketservice.model.Ticket;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface BookTicketRepository extends MongoRepository<Ticket,String> {


}
