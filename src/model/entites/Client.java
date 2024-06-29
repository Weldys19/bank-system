package model.entites;

import java.time.LocalDate;

public class Client {
	
	private String fullName;
	private LocalDate dateOfBirth;
	private Integer id;
	private String email;
	private String numberTelephone;
	
	public Client(String fullName, LocalDate dateOfBirth, Integer id, String email, String numberTelephone) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.email = email;
		this.numberTelephone = numberTelephone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberTelephone() {
		return numberTelephone;
	}

	public void setNumberTelephone(String numberTelephone) {
		this.numberTelephone = numberTelephone;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Integer getId() {
		return id;
	}
	
}
