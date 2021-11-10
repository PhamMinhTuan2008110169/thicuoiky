package tuan02;

import java.util.Scanner;
public class lab3 {
    public static void main(String[] args){
		int soDien, tien, muc1 = 1000, muc2 = 1200;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dien thang: ");
		soDien = scanner.nextInt();
		if(soDien <= 50 && soDien > 0)
			tien = soDien * muc1;
		else
		 	tien = 50 * muc1 + (soDien - 50) * muc2;
		System.out.printf("Tien dien thang nay = %d\n", tien);
		scanner.close();
	}
}
