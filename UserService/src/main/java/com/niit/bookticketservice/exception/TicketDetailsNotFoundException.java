package com.niit.bookticketservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "Ticket with specified ID does not exists")
public class TicketDetailsNotFoundException extends Exception {
}
