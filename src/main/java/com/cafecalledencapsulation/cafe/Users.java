package com.cafecalledencapsulation.cafe;

public class Users {

	private Long id;
	

	private String firstName;
	private String lastName;
	private String socialSecurity;
	private int shoeSize;
	private String Roast;
	private String MyOwn;
	
	public Users() {
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getRoast() {
		return Roast;
	}

	public void setRoast(String roast) {
		Roast = roast;
	}

	public String getMyOwn() {
		return MyOwn;
	}

	public void setMyOwn(String myOwn) {
		MyOwn = myOwn;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

}
