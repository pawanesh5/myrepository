package com.niit.bookticketservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {
    private String ticketNo;
    private String source;
    private String destination;
    private double pricePerTicket;


    public Ticket() {
    }

    public Ticket(String ticketNo, String source, String destination, double pricePerTicket) {
        this.ticketNo = ticketNo;
        this.source = source;
        this.destination = destination;
        this.pricePerTicket = pricePerTicket;

    }



    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPricePerTicket() {
        return pricePerTicket;
    }

    public void setPricePerTicket(double pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNo='" + ticketNo + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", pricePerTicket=" + pricePerTicket +
                '}';
    }
}
