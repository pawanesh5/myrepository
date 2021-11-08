package com.niit.bookticketservice.service;

import com.niit.bookticketservice.exception.TicketAlreadyExistsException;
import com.niit.bookticketservice.exception.TicketDetailsNotFoundException;
import com.niit.bookticketservice.model.Ticket;
import com.niit.bookticketservice.repository.BookTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTicketServiceImpl implements BookTicketService {

    private BookTicketRepository bookTicketRepository;

    @Autowired
    public BookTicketServiceImpl(BookTicketRepository bookTicketRepository) {
        this.bookTicketRepository = bookTicketRepository;
    }


    @Override
    public Ticket addTicket(Ticket ticket) throws TicketAlreadyExistsException {
        if(bookTicketRepository.findById(ticket.getTicketNo()).isPresent())
        {
            throw new TicketAlreadyExistsException();
        }
        return bookTicketRepository.save(ticket);
    }

    @Override
    public double book(int noOfTravellers, Ticket ticket) throws TicketDetailsNotFoundException {
        if(bookTicketRepository.findById(ticket.getTicketNo()).isEmpty())
        {
            System.out.println("exception");
            throw new TicketDetailsNotFoundException();
        }
        Ticket t = bookTicketRepository.findById(ticket.getTicketNo()).get();

        return t.getPricePerTicket()*noOfTravellers;
    }
}
