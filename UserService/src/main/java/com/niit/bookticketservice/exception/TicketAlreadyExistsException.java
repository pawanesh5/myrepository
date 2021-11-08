package com.niit.bookticketservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT, reason = "Ticket details exists")
public class TicketAlreadyExistsException extends Exception {
}
