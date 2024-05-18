package models;

public class Feedback {
	
	private User client;
    private Hotel hotel;
    private Airline compagny;
    private String commentaire;
    private Double rates; 
    public Double getRates() {
		return rates;
	}
	public void setRates(Double rates) {
		this.rates = rates;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Airline getCompagnieAerienne() {
		return compagny;
	}
	public void setCompagnieAerienne(Airline compagnieAerienne) {
		this.compagny = compagnieAerienne;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	
}
