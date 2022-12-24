package first_project;

import java.util.Scanner;

public class paticaDev {

	public static void main(String[] args) {
		double kdv = 0.18;
		double kdv1 = 0.08;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your wage");
		double wage1 = sc.nextDouble();
		if(wage1>=0 || wage1<=1000) {
			int total_fiyat =(int) (wage1*kdv);
			System.out.println(total_fiyat);
		}else {
			int total_fiyat1 = (int) (wage1*kdv1) ;
			System.out.println(total_fiyat1);
		}

	}

}
