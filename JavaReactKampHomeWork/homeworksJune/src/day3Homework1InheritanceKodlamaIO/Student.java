package day3Homework1InheritanceKodlamaIO;

public class Student extends User{
	
	private String _courseTaken;
	private int _studentId;
	private final String _userType = "Student";
	
	public Student() {
		super();
	}
	public Student( int id, String firstName, String lastName, int age, String eMail, int studentId, String courseTaken) {
		super();		
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._age = age;
		this._eMail = eMail;
		this._studentId = studentId;
		this._courseTaken = courseTaken;
	}
	public int getStudentId() {
		return _studentId;
	}
	public void setStudentId(int studentId) {
		this._studentId = studentId;
	}
	public String getCourseTaken() {
		return _courseTaken;
	}
	public void setCourseTaken(String courseTaken) {
		this._courseTaken = courseTaken;
	}
	public String getUserType() {
		return _userType;
	}
}

