package models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private int hotel_id ;
	private String name;
	private int convention;
    private String Country;
    private String city;
    private String address;
    private String email ;
    private String phoneNumber;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(int hotel_id, String name, String country, String city, String address, String email, String phoneNumber) {
		this.hotel_id = hotel_id;
		this.name = name;
		setCountry(country);
		this.setCity(city);
		this.address = address;
		this.setEmail(email);
        this.phoneNumber = phoneNumber;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }
    
    public Hotel(int hotelId, String name, String country, String city, String address, String email,String phoneNumber, List<Room> rooms, List<Reservation> reservations) {
		super();
		this.hotel_id = hotel_id;
		this.name = name;
		setCountry(country);
		this.setCity(city);
		this.address = address;
		this.setEmail(email);
		this.phoneNumber = phoneNumber;
		this.rooms = rooms;
		this.reservations = reservations;
	}

    
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

  
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getConvention() {
		return convention;
	}

	public void setConvention(int convention) {
		this.convention = convention;
	}
}
