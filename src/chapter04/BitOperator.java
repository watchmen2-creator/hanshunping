package chapter04;

public class BitOperator {
	public static void main(String[] args){
		System.out.println(2&3);
		//  2: 00000000 00000000 00000000 00000010
		//  3: 00000000 00000000 00000000 00000011
		//2&3: 00000000 00000000 00000000 00000010
		//output:2

		System.out.println(~ -2 );
		// -2 source code : 10000000 00000000 00000000 000000010
		// -2 reverse code : 11111111 11111111 11111111 11111101
		// -2  complement code : 11111111 11111111 11111111 11111110
		// ~-2 complement code : 00000000 00000000 00000000 00000001
		//The complement symbol bit after the operation is 0, which is a positive number, and the positive number three codes are in one, which is also the source code of the number after the operation
		// ~-2 source code : 00000000 00000000 00000000 00000001
		//output:1

		System.out.println(~ 2);
		// 2 source code : 00000000 00000000 00000000 00000010
		// 2 reverse code : 00000000 00000000 00000000 00000010
		// 2 complement code : 00000000 00000000 00000000 00000010
		// ~2 complement code : 11111111 11111111 11111111 11111101
		// ~2 reverse code : 11111111 11111111 11111111 11111100
		// ~2 source code : 10000000 00000000 00000000 00000011
		//output:-3

		System.out.println(2|3);
		// 2 three codes are in one : 00000000 00000000 00000000 00000010
		// 3 three codes are in one : 00000000 00000000 00000000 00000011
		// 2|3 complete code : 00000000 00000000 00000000 00000011
		// The complement symbol bit after the operation is 0, which is a positive number, and the positive number is three codes in one, which is also the source code of the number after the operation
		// output:3

		System.out.println(2^3);
		// 2 three codes are in one : 00000000 00000000 00000000 00000010
		// 3 three codes are in one : 00000000 00000000 00000000 00000011
		// 2^3 complete code : 00000000 00000000 00000000 00000001
		// The complement symbol bit after the operation is 0, which is a positive number, and the positive number is three codes in one, which is also the source code of the number after the operation
		// output:1

		System.out.println(~ -5);
		// -5 source code : 10000000 00000000 00000000 00000101
		// -5 reverse code: 11111111 11111111 11111111 11111010
		// -5 complement code : 11111111 11111111 11111111 11111011
		// ~-5 complement code : 00000000 00000000 00000000 00000100
		// The complement symbol bit after the operation is 0, which is a positive number, and the positive number is three codes in one, which is also the source code of the number after the operation
		// output:4

		System.out.println(13 & 7);
		// 13 three codes are in one : 00000000 00000000 00000000 00001101
		// 7 three codes are in one : 00000000 00000000 00000000 00000111
		// 13 & 7 complement code : 00000000 00000000 00000000 00000101
		// The complement symbol bit after the operation is 0, which is a positive number, and the positive number is three codes in one, which is also the source code of the number after the operation
		// output:5

		System.out.println(5 | 4);
		// 5 three codes are in one : 00000000 00000000 00000000 00000101
		// 4 three codes are in one : 00000000 00000000 00000000 00000100
		// 5 | 4 complete code : 00000000 00000000 00000000 00000101
		// The complement symbol bit after the operation is 0, which is a positive number, and the positive number is three codes in one, which is also the source code of the number after the operation
		// output:5

		System.out.println(-3 ^ 3);
		// -3 source code : 10000000 00000000 00000000 00000011
		// -3 reverse code : 11111111 11111111 11111111 11111100
		// -3 complement code : 11111111 11111111 11111111 11111101
		// 3 three codes are in one : 00000000 00000000 00000000 00000011
		// -3 ^ 3 complete code : 11111111 11111111 11111111 11111110
		// -3 ^ 3 reverse code : 11111111 11111111 11111111 11111101
		// -3 ^ 3 source code : 10000000 00000000 00000000 00000010
		// output:-2

	}
}

class BitOperator02 {
	public static void main(String[] args){
		
	}
}