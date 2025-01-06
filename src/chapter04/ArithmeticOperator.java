public class ArithmeticOperator {
	public static void main(String[] args){
		System.out.println(10 / 4); //2
		System.out.println(10.0 / 4); //2.5
		double d = 10 / 4 ;
		System.out.println(d); //2.0

		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1
		System.out.println("================================");

		int i = 1 ;
		i = i++ ;
		System.out.println(i) ;		

		int j = 1 ;
		j = ++j ;
		System.out.println(j);

	}
}


class ArithmeticOperatorExercise01 {
	public static void main(String[] args){
		int i1 = 10 ;
		int i2 = 20 ;
		int i = i1++;
		System.out.println("i=" +i);
		System.out.println("i2="+i2);
		i = --i2;
		System.out.println("i=" +i);
		System.out.println("i2="+i2);

	}
}

class ArithmeticOperatorExercise02 {
	public static void main(String[] args){
		int days = 59 ;
		System.out.println("weeks:" +days / 7 );
		System.out.println("weeks:" +days % 7 );
		
		double t = 234.5 ; 
		double s = (t - 100) * 5 / 9 ;
		System.out.println(s);

	}
}
