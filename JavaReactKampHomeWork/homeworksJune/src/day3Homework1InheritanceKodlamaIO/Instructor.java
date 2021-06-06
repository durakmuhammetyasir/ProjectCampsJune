package day3Homework1InheritanceKodlamaIO;

public class Instructor extends User{
	
	private String _courseGiven;
	private final String _userType ="Instructor ";
	private int _instructorId;
	
	public Instructor() {
		super();
	}
	public Instructor( int id, String firstName, String lastName, int age, String eMail, int instructorId, String courseGiven) {
		super();		
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._age = age;
		this._eMail = eMail;
		this._instructorId = instructorId;
		this._courseGiven = courseGiven;
	}
	
	public int getInstructorId() {
		return _instructorId;
	}	
	public void setInstructorId(int instructorId) {
		this._instructorId = instructorId;
	}
	public String getCourseGiven() {
		return _courseGiven;
	}
	public void setCourseGiven(String courseGiven) {
		this._courseGiven = courseGiven;
	}
	public String getUserType() {
		return _userType;
	}
}
