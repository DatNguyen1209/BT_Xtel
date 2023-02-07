package Bai4;

public class Student {

	private int id;
	private String studentName;
	private int age;
	private String address;
	
	
	public Student() {
		super();
	}

	public Student(int id, String studentName, int age, String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
