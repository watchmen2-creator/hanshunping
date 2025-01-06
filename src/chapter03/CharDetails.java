public class CharDetails {
	public static void main(String[] args){
		char c1 = 97;
		System.out.println(c1);//In Java, the essence of char is an integer, and when output, it is the corresponding character in the unicode code

		char c2 = 'a';
		System.out.println((int)c2);//If you want to output the unicode encoding of a character, you can cast it to int output
		

		System.out.println('a' + 10);//The char type is operable and is equivalent to an integer
		//The type of the result after the operation is an integer, and the output is the integer, not the character corresponding to the integer
		System.out.println(98);//Print out an integer directly, and the output is the integer, not the corresponding character of the integer

		char c3 = 'b' + 1 ; 
		/*'b'是字符，字符又是整数，可以参与计算，所以'b' + 1 算完现在是一个整数99，然后c3 = 99。
		但是c3又是用char定义的，此时相当于给c3转了一下类型，从int转成char了
		*/
		System.out.println((int)c3);//output:99
		System.out.println(c3);//output:c

		int c4 = 'b' + 1 ;
		/*'b'是字符，字符又是整数，可以参与计算，所以'b' + 1 算完现在是一个整数99，然后c4 = 99。
		c4又是用int定义的，此时相当于给c4转了一下类型，从int转成int了。（或者就没有转，本来就是int）
		*/
		System.out.println(c4);//output:99
		System.out.println((char)c4);//output:c
		//验证通过
	}
}
