package predefined_class;

import java.util.Scanner;

public class my_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a :");
		int a=sc.nextInt();
		System.out.println("enter b :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("value of c :"+c);

	}

}
