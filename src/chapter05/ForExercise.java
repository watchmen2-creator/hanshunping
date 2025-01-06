public class ForExercise {
	public static void main(String[] args){
		int count = 0 ;
		for (int i = 1 ; i <= 100 ; i ++){
			if(i % 9 ==0){
				count++ ;
				System.out.println(i + "is the " + count + "could %9 number");
			}
		}
		System.out.println("for is over , count:" + count) ;


		for (int a = 0 ; a <= 5 ; a++){
			int b = 5 - a  ;
			System.out.println(a + " + " + b + " = " + "5 ;");
		}
	}
}
