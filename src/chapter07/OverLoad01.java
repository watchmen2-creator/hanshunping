public class OverLoad01 {
	public static void main(String[] args){
		Mycalculator calc = new Mycalculator();
		System.out.println(calc.calculate(2 , 3 ));
		System.out.println(calc.calculate(2 , 3.5 ));
		System.out.println(calc.calculate(2.8 , 3 ));
		System.out.println(calc.calculate(2 , 8 , 3 ));

	}
}

class Mycalculator {
	public int calculate(int n1 , int n2){
		return (n1 + n2) ;
	}
	public double calculate(int n1 ,double n2){
		return (n1 + n2) ;
	}
	public double calculate(double n1 ,int n2){
		return (n1 + n2) ;
	}
	public int calculate(int n1 ,int n2 , int n3){
		return (n1 + n2 + n3) ;
	}
}

