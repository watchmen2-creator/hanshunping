import java.util.Scanner ; 

public class NestedIf {
	public static void main(String[] args){
		System.out.println("please input your score");
		Scanner iscan = new Scanner(System.in);
		double score = iscan.nextDouble();
		
		if(score > 8.0){
			System.out.println("please input your score and gender");
			char gender = iscan.next().charAt(0);
			if(gender == 'M'){
				System.out.println("ok,man");
			}else if(gender == 'W'){
				System.out.println("ok,women");
			}
		}else{
			System.out.println("No");
		}
	}
}


class NestedIf02 {
	public static void main(String[] args){
		System.out.println("please input mouth");
		Scanner iscan = new Scanner(System.in);
		int mouth = iscan.nextInt();
		
		if(mouth >= 4 && mouth <= 10){
			System.out.println("please input your age");
			int age = iscan.nextInt();
			if(age >= 18 && age <= 60){
				System.out.println("60");
			}else if(age < 18){
				System.out.println("half");
			}else if(age > 60){
				System.out.println("one of three");
			}
		}else{
			System.out.println("please input your age");
			int age = iscan.nextInt();
			if(age >= 18 && age <= 60 ){
				System.out.println("40");
			}else{
				System.out.println("20");
			}
		}
	}
}
