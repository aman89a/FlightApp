package com.company.models;

public class Ticket {
    private Long id;
    private double prise;
    private boolean active;
    private String flightId;

    public Ticket() {
    }

    public Ticket(Long id, double prise, boolean active, String flightId) {
        this.id = id;
        this.prise = prise;
        this.active = active;
        this.flightId = flightId;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	@Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", prise=" + prise +
                ", active=" + active +
                '}';
    }
}
