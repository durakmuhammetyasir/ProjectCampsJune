package day3Homework1InheritanceKodlamaIO;

public class User {
	int _id;
	String _firstName;
	String _lastName;
	int _age;
	String _eMail;	

	public User() {
	}
	
	public User(int id, String firstName, String lastName, int age, String eMail) {
		
		this._firstName = firstName;
		this._lastName = lastName;
		this._age = age;
		this._eMail = eMail;
		this._id = id;
	}
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getEMail() {
		return _eMail;
	}
	public void setEMail(String eMail) {
		this._eMail = eMail;
	}
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		this._lastName = lastName;
	}
	public int getAge() {
		return _age;
	}
	public void setAge(int age) {
		this._age = age;
	}
}