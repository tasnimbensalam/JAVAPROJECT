package models;

public class User {
	 private int userId;
	    private String fullName;
	    private String cin;
	    private String phone;
	    private String email;
	    private String password;
	    private String address;
	    private String role;
		public User(int userId, String fullName, String cin, String phone, String email, String password,
				String address, String role) {
			this.userId = userId;
			this.fullName = fullName;
			this.cin = cin;
			this.phone = phone;
			this.email = email;
			this.password = password;
			this.address = address;
			this.setRole(role);
		}
		public int getUserId() {
			return userId;
		}
		public void setCustomerId(int customerId) {
			this.userId = userId;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	
}
