package chapter07;

public class Recursion01 {
	public static void main(String[] args){
		T t1 = new T () ;
		t1.test(4);
		System.out.println(t1.factorial(5));
	}
}

class T{
	public void test(int n ){
		if(n > 2){
			test(n-1);
		}
		System.out.println("n = " + n );	
				
	}

	public int factorial(int n ){
		if(n == 1 ){
			return 1 ;
		}else{
			return factorial( n - 1) * n;
		}
	}
}
