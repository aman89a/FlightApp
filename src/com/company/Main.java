package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.company.models.*;
import com.company.models.Passanger.Walet;

public class Main {

    public static void main(String[] args) throws ParseException {

        Plane plane = new Plane(1L, "Boing 737", 580);
        City cityFrom = new City(1L, "Bishkek");
        City cityTo = new City(2L, "Chicago");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyyy HH:mm");

        //Registration flight 
        Flight chicago_bishkek = registrationFlight(1L, "25.06.2020 15:30", "25.06.2020 20:30", cityFrom, cityTo, plane);

        //Registration passanger
        Passanger passenger = registrationPassanger(1L, "Bolot", "996585858", new Ticket(1L, 5000.0, true, "1"), new Walet(1L, 10000.0));

        System.out.println(passenger);


    }

    public static Passanger registrationPassanger(Long id, String name, String phone, Ticket ticket, Walet walet) {

        Passanger passanger = new Passanger();
        passanger.setId(id);
        passanger.setName(name);
        passanger.setPhone(phone);
        passanger.setTicket(ticket);
        if (ticket != null & ticket.getPrise() <= walet.getCount()) {
            passanger.setWalet(new Walet(walet.getId(), walet.getCount() - ticket.getPrise()));
        } else {
            return null;
        }
        return passanger;
    }

    public static Flight registrationFlight(Long id, String outDate, String toDate, City from, City to, Plane plane) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        Flight flight = new Flight();
        flight.setId(id);
        flight.setOutDate(sdf.parse(outDate));
        flight.setToDate(sdf.parse(toDate));
        flight.setFrom(from);
        flight.setTo(to);
        flight.setPlane(plane);
        flight.setTicketCount(plane.getCapacity());

        return flight;
    }
}
