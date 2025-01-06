 public class LogicOperator01 {
 	public static void main(String[] args){
 		int age = 30 ;
 		if (age > 20 && age < 50){
 			System.out.println("ok");
 		}

 		int a = 4 ;
 		int b = 9 ;
 		if (a < 1 && ++b < 5){
 			System.out.println("111");
 		}
 		System.out.println("a = " + a + ";b = " + b);
 	}
 }
