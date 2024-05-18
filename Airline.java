package models;

import java.util.List;
import java.util.ArrayList;

public class Airline {
    private String name;
    private String code;
    private int convention;
    private List<Flight> flights;
   
    public Airline(String name, String code) {
        this.name = name;
        this.code = code;
        this.flights = new ArrayList<>();
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

	public int getConvention() {
		return convention;
	}

	public void setConvention(int convention) {
		this.convention = convention;
	}

   
}
