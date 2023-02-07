package Bai1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int x = 5,  y = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Nhập số y = ");
				y = new Scanner(System.in).nextInt();
			if(x == y) {
				System.out.println("Đăng nhập thành công!");
				break;
			}
		}
		if( x != y) {
			
			System.out.println("Đăng nhập thất bại!!!");
		}

	}

}
