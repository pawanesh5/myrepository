package com.niit.bookticketservice.controller;

import com.niit.bookticketservice.exception.TicketAlreadyExistsException;
import com.niit.bookticketservice.exception.TicketDetailsNotFoundException;
import com.niit.bookticketservice.model.Ticket;
import com.niit.bookticketservice.service.BookTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bookticketservice/")
public class BookTicketController {

    private BookTicketService bookTicketService;

    @Autowired
    public BookTicketController(BookTicketService bookTicketService) {
        this.bookTicketService = bookTicketService;
    }

    @PostMapping("book/ticket")
    public ResponseEntity<?> saveTicketDetails(@RequestBody Ticket ticket) throws TicketAlreadyExistsException {
        return new ResponseEntity<>(bookTicketService.addTicket(ticket), HttpStatus.CREATED);
    }
    @PostMapping("book/{noOfTravellers}")
    public ResponseEntity<?> book(@RequestBody Ticket ticket,@PathVariable String noOfTravellers) throws TicketDetailsNotFoundException {
        return new ResponseEntity<>(bookTicketService.book(Integer.parseInt(noOfTravellers),ticket), HttpStatus.FOUND);
    }

}
