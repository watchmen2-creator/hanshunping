public class TernaryOperator {
	public static void main(String[] args){
		int a = 10 , b = 50 ;
		int result = a > b ? a-- : b-- ;
		System.out.println(result + ";" + b);

	}
}


class TernaryOperatorDetails {
	public static void main(String[] args){
		int a = 10 , b = 50 ;
		int result = a > b ? a-- : b-- ;
		System.out.println(result + ";" + b);

	}
}

class TernaryOperatorExertise {
	public static void main(String[] args){
		int a = 55 , b = 55 , c = 123 ;
		int max1 , max2 ;
		max1 = a > b ? a :  b ;
		max1 = max1 > c ? max1 : c ;

		max2 = a > b ? ( a > c ? a : c ) : (b > c ? b : c) ;
		
		System.out.println(max1 ) ;
		System.out.println(max2 ) ;

	}
}
