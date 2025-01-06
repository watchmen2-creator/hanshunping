package chapter04;

import java.util.Scanner ;

public class Input {
	public static void main(String[] args){

		Scanner myscanner = new Scanner(System.in);


		System.out.println("Please input your name : ");
		String name = myscanner.next();
		System.out.println("Please input your age : ");
		int age = myscanner.nextInt();
		System.out.println("Please input your salary : ");
		double salary = myscanner.nextDouble();
		System.out.println(name + "\' age is : " + age + " and his Salary is : " + salary );

	}
}
