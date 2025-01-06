public class  FloatDatile {
	public static void main(String[] args){
		//float a0 = 1.1 ; // this is an error
		float a1 = 1.1f ;
		System.out.println(a1);
		double a2 = 1.1 ;
		System.out.println(a2);
		double a3 = 1.2f ;
		System.out.println(a3);
		double a4 = .258;  //It's the same as 0.258
		//The 0 before the decimal point can be omitted
		System.out.println(a4);
		double a5 = 5.12e2 ; //Scientific notation
		//It's the same as 5.12 * 10^2
		System.out.println(a5);
		double a6 = 520e-2 ;//It's the same as 520 * 10^-2
		System.out.println(a6);

		//Compare the precision of double and float
		double num9 = 2.1234567851;
		float num10 = 2.1234567851f;
		System.out.println(num9);
		System.out.println(num10);

		double num11 = 2.7 ;
		double num12 = 8.1 / 3;
		System.out.println(num11);//2.7
		System.out.println(num12);//2.6999999999999997
		//Note: Do not compare the decimal after the calculation, this is very dangerous
		if(num11 == num12 ){
			System.out.println("xiangdeng");
		}
		else{
			System.out.println("buxiangdeng");
			System.out.println("Note: Do not compare the decimal after the calculation, this is very dangerous");
		}

		/* If it is necessary to compare equality, you can take the absolute value of the difference, 
		and then define a precision, the absolute value of the difference can be considered equal within the precision
		*/
		if (Math.abs(num11 - num12) < 0.001)
		{
			System.out.println("xiangdeng");
			System.out.println("the absolute of difference is :" + Math.abs(num11 - num12) );
		}
		else{
			System.out.println("buxiangdeng");
			System.out.println("Note: Do not compare the decimal after the calculation, this is very dangerous");
		}

	}
}
