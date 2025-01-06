package chapter05;

import java.util.Scanner ;

public class Switch01 {
	public static void main(String[] args){
		System.out.println("please input your score");
		Scanner iscan = new Scanner(System.in);
		double score = iscan.nextDouble();

		if (score >= 0 && score <= 100){

			switch((int)(score / 60)){
			case 1 :
				System.out.println("Pass");
				break;
			case 0 :
				System.out.println("No Pass");
				break;
			// default:
			// 	System.out.println("input error");
			// break;
			}
			System.out.println("switch is execute over");
		}else{
			System.out.println("input error");
		}	
	}
}


class Switch02 {
	public static void main(String[] args){
		System.out.println("please input  mouth");
		Scanner iscan = new Scanner(System.in);
		int mouth = iscan.nextInt();

		if (mouth >= 1 && mouth <= 12){

			switch(mouth){
			case 3 :				
			case 4 :
			case 5 :
				System.out.println("Spring");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("Summer");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("Automn");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
				break;
			// default:
			// 	System.out.println("input error");
			// break;
			}
			System.out.println("switch is execute over");
		}else{
			System.out.println("input error");
		}	
	}
}
