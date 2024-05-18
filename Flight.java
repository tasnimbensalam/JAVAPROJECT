package models;

import java.util.Date;
import java.util.Map;

public class Flight {
	    private String flight_num;
	    private String origin;
	    private String destination;
	    private Date d_depart;
	    private Date d_arrive;
	    private Date t_depart;
	    private Date t_arrival;
	    private Boolean Availability;
	    private Map<String,Integer> Capacity ;
	    

		public Flight(String flight_num, String origin, String destination, Date d_depart, Date d_arrive, Date t_depart,
				Date t_arrival, Boolean availability, Map<String, Integer> capacity) {
			super();
			this.flight_num = flight_num;
			this.origin = origin;
			this.destination = destination;
			this.d_depart = d_depart;
			this.d_arrive = d_arrive;
			this.t_depart = t_depart;
			this.t_arrival = t_arrival;
			Availability = availability;
			Capacity = capacity;
		}
		
		public String getFlight_num() {
			return flight_num;
		}

		public void setFlight_num(String flight_num) {
			this.flight_num = flight_num;
		}

		public void setAvailability(Boolean availability) {
			Availability = availability;
		}

		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public Date getD_depart() {
			return d_depart;
		}
		public void setD_depart(Date d_depart) {
			this.d_depart = d_depart;
		}
		public Date getD_arrive() {
			return d_arrive;
		}
		public void setD_arrive(Date d_arrive) {
			this.d_arrive = d_arrive;
		}
		public Date getT_depart() {
			return t_depart;
		}
		public void setT_depart(Date t_depart) {
			this.t_depart = t_depart;
		}
		public Date getT_arrival() {
			return t_arrival;
		}
		public void setT_arrival(Date t_arrival) {
			this.t_arrival = t_arrival;
		}
		public Map<String, Integer> getCapacity() {
			return Capacity;
		}
		public void setCapacity(Map<String, Integer> capacity) {
			Capacity = capacity;
		}
	 
	    
	    
	
}