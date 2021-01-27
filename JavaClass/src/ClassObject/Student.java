package ClassObject;

public class Student {

	private int studentId;
	private String studentName;
	private String emailId;

	public void getStudentId() {
		System.out.println(studentId);
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Student(int studentId, String studentName, String emailId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
	}

	public void getStudentName() {
		System.out.println(studentName);
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void getEmailId() {
		System.out.println(emailId);
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static void main(String[] args) {
		Student stud = new Student(118,"Santheesh", "santheesh62@gmail.com");
		stud.getStudentId();
		stud.getStudentName();
		stud.getEmailId();
	}
}
