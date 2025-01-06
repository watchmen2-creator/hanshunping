package chapter05;

import java.util.Scanner ;

public class While01 {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);

		System.out.println("plesae input start value");
		int startNum = iscan.nextInt();

		System.out.println("plesae input end value");
		int endNum = iscan.nextInt();

		System.out.println("plesae input % value");
		int moNum = iscan.nextInt();

		int i = startNum ;
		int count = 0 ;
		while(i <= endNum) {
			if(i % moNum == 0){
				count++;
				System.out.println(i + " is No. " + count + "num  could % moNum ;");
			}
			
			i++ ;
		}
		System.out.println("the count is " + count + " could % " + moNum + " in " + startNum + " to " + endNum );
		System.out.println("while is execute over");
	}
}
