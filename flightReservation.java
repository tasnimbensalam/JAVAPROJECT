package models;

import java.util.Date;

public class flightReservation {
    private int reservationId;
    private Flight flight;
    private User passenger;
    private Date reservationDate;
    private String seatNumber;

    public flightReservation(int reservationId, Flight flight, User passenger, Date reservationDate, String seatNumber) {
        this.reservationId = reservationId;
        this.flight = flight;
        this.passenger = passenger;
        this.reservationDate = reservationDate;
        this.seatNumber = seatNumber;
    }

  
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getPassenger() {
        return passenger;
    }

    public void setPassenger(User passenger) {
        this.passenger = passenger;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}

