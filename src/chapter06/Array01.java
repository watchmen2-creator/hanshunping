package chapter06;

public class Array01 {
	public static void main(String[] args){
		double[] hens = { 3 , 5 , 1 , 3.4 , 2 , 50 };
		double sum = 0 ;
		for (int i = 0 ; i < hens.length ; i++){
			sum += hens[i];
		}
		System.out.println(sum);
	}
}
