package com.company.models;

import java.util.Date;

public class Flight {

    private Long id;
    private Date outDate;
    private Date toDate;

    private City from;
    private City to;

    private Plane plane;
    
    private int ticketCount;

    public Flight() {

    }

    public Flight(Long id, Date outDate, Date toDate, City from, City to, Plane plane, int ticketCount) {
        this.id = id;
        this.outDate = outDate;
        this.toDate = toDate;
        this.from = from;
        this.to = to;
        this.plane = plane;
        this.ticketCount = ticketCount;
    }

    


	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", outDate=" + outDate +
                ", toDate=" + toDate +
                ", from=" + from +
                ", to=" + to +
                ", plane=" + plane +
                '}';
    }
}
