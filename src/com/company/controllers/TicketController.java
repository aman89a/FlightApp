package com.company.controllers;

import com.company.models.Ticket;
import com.company.services.TicketService;

public class TicketController {

    TicketService ticketService = TicketService.INSTANCE;

    public void saveTicket() {

        Ticket ticket = new Ticket();
        ticketService.saveTicket(ticket);
    }
}
