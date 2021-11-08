package com.niit.bookticketservice.service;

import com.niit.bookticketservice.exception.TicketAlreadyExistsException;
import com.niit.bookticketservice.exception.TicketDetailsNotFoundException;
import com.niit.bookticketservice.model.Ticket;


public interface BookTicketService {
    Ticket addTicket(Ticket ticket) throws TicketAlreadyExistsException;
    double book(int noOfTravellers, Ticket ticket) throws TicketDetailsNotFoundException;

}
