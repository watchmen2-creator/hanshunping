package chapter07;

public class OverLoadExercise {
	public static void main(String[] args){
		M m = new M();
		System.out.println(m.max( 2 , 3 ));
		System.out.println(m.max( 2.5, 3.4 ));
		System.out.println(m.max( 2.5, 3.4 , 8 ));
		m.m(5);
		m.m(2 , 3 ) ;
		m.m("V54545");

	}
}

class M {
	public void m (int n1){
		System.out.println(n1 + " * " + n1 + " = " +  n1 * n1 );
	}
	public void m (int n1 ,int n2){
		System.out.println(n1 + " * " + n2 + " = " +  n1 * n2 );
	}
	public void m (String str){
		System.out.println("str : " + str );
	}


	public int max(int n1 , int n2){
		return (n1 > n2)? n1 : n2 ;
	}
	public double max(double n1 , double n2){
		return (n1 > n2)? n1 : n2 ;
	}
	public double max(double n1 , double n2 , double n3){
		return max(n1 , n2) > n3 ? max(n1 , n2) : n3 ;
	}
}


