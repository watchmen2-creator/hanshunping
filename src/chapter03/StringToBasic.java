public class StringToBasic {
	public static void main(String[] args){
		int n1  = 100 ;
		float f1 = 1.23f ;
		double d1 = 43.54 ;
		boolean b1 = true ;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4) ;
	}
}

class StringToBasicDetails {
	public static void main(String[] args){
		String s1 = "13";
		int n1 = Integer.parseInt(s1);
		System.out.println(n1);
	}
}
