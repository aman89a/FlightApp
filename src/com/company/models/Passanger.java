package com.company.models;

public class Passanger {

    private Long id;
    private String name;
    private String phone;
    private Ticket ticket;
    private Walet walet;

    public Passanger() {
    }

    public Passanger(Long id, String name, String phone, Ticket ticket, Walet walet) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.ticket = ticket;
        this.walet = walet;
    }

    
    public Walet getWalet() {
		return walet;
	}

	public void setWalet(Walet walet) {
		this.walet = walet;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	
	public static class Walet{
		Long id;
		double count;

        public Walet() {
        }

        public Walet(Long id, double count) {
            this.id = id;
            this.count = count;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public double getCount() {
            return count;
        }

        public void setCount(double count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "Walet{" +
                    "id=" + id +
                    ", count=" + count +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Passanger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", ticket=" + ticket +
                ", walet=" + walet +
                '}';
    }
}


