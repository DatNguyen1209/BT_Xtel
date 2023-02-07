package Bai2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int soDien = 0, tongTien = 0;
		System.out.println("Mời nhập số điện: ");
		soDien = new Scanner(System.in).nextInt();
		if(soDien <= 100) {
			tongTien = soDien * 1000;
			System.out.println("Tổng số tiền phải trả là: "+tongTien);
		}else if(soDien > 100 && soDien <=150) {
			tongTien = 100 * 1000 +(soDien - 100)*1500;
			System.out.println("Tổng số tiền phải trả là: "+tongTien);
		}else {
			tongTien = (100*1000) + (1500*50) + (soDien - 150)*2000;
			System.out.println("Tổng số tiền phải trả là: "+tongTien);
		}

	}

}
