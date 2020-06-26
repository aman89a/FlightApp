package com.company.services;

import com.company.models.Ticket;
import com.company.services.impl.TicketServiceImpl;

import java.util.List;

public interface TicketService {

    TicketService INSTANCE = new TicketServiceImpl();

    void saveTicket(Ticket ticket);
    List<Ticket> getTicket();
}
