import java.util.Scanner ;

public class IfExercise {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in) ; 
		System.out.println("please input years to reverse is run yesr");
		int year = iscan.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("OK");
		}else{
			System.out.println("NO");
		}
	}
}

class IfExercise02 {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in) ; 
		System.out.println("please input Baoguo's score");
		int score = iscan.nextInt();
		if (score == 100 ){
			System.out.println("jihao");
		}else if( score > 80 && score <= 99){
			System.out.println("youxiu");
		}else if(score >= 60 && score <= 80){
			System.out.println("yiban");
		}else{
			System.out.println("bujige");
		}
	}
}
