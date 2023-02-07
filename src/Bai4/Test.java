package Bai4;

import java.util.Scanner;

public class Test {

	static void testInsert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập tên sinh viên: ");
		String studentName = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		int age = scanner.nextInt();
		System.out.println("Nhập địa chỉ: ");
		scanner.nextLine();
		String address = scanner.nextLine();
		Student std = new Student(id, studentName, age, address);
		System.out.println(std);	
		
		StudentDAO.getInsteance().Insert(std);
		
	}
	public static void main(String[] args) {
		

		testInsert();
	}

}
