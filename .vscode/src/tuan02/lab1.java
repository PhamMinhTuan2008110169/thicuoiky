package tuan02;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a, b theo dang ax + b = 0");
		System.out.print("He So a: ");
		a = scanner.nextDouble();
		System.out.print("He So b: ");
		b = scanner.nextDouble();
		if(a == 0)
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem\n");
			else
				System.out.println("Phuong trinh vo nghiem\n");
		else
			System.out.printf("x = %.3f\n", -b/a);
		scanner.close();
	}

}
