package day4Homework3GamerBackEnd.entities;

import java.util.GregorianCalendar;

import day4Homework3GamerBackEnd.abstracts.Entity;

public class Gamer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private GregorianCalendar dateOfBirth;
	private String nationalityId;
	public Gamer() {
		super();
	}
	public Gamer(int id, String firstName, String lastName, GregorianCalendar dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
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
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	@Override
	public String toString() {
		return "Gamer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ",, nationalityId=" + nationalityId + "]";
	}

}


