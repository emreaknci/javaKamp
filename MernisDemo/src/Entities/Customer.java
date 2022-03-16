package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalityId;

	public Customer(int id, String firstName, String lastName, int dateOfBirth2, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth2;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
