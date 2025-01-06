import java.util.Scanner ;

public class Assignments {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);
		System.out.println("Please enter an entire three digit number to determine whether it is a daffodil number ?");
		int sourceNum = iscan.nextInt();
		int operatorNum = sourceNum ;
		int quantileNum = operatorNum % 10 ;
		operatorNum /= 10 ;
		int decileNum = operatorNum % 10 ;
		operatorNum /= 10 ;
		int percentileNum = operatorNum % 10 ;
		operatorNum /= 10 ;
		if(sourceNum == (quantileNum * quantileNum * quantileNum + decileNum * decileNum * decileNum + percentileNum * percentileNum * percentileNum)){
			System.out.println(sourceNum + " is a number of daffodils");
		}else{
			System.out.println(sourceNum + " is not a number of daffodils");
		}

	}
}


 class Assignments6 {
	public static void main(String[] args){
		int count = 0 ;
		int ic = count % 5 ;
		for(int i = 1 ;i <= 100 ; i++){
			if(i % 5 != 0){
				count++ ;
				ic = count % 5 ;
				switch(ic){
					case 1 :{
						System.out.print(i + "\t");
						break ;
					}
					case 2 :{
						System.out.print(i + "\t");
						break ;
					}
					case 3 :{
						System.out.print(i + "\t");
						break ;
					}
					case 4 :{
						System.out.print(i + "\t");
						break ;
					}
					case 0 :{
						System.out.println(i + "\t");
						break ;
					}
				}
			}else{
				continue;
			}
			
		}
	}
}




class Assignments7 {
	public static void main(String[] args){
		// char letter = 'A' ; //97
		// System.out.println(letter + 0);
		for(int i = 97 ; i <=(97+25) ; i++ ){
			System.out.print((char)(i) + "\t");
		}
		System.out.println();
		for(int j = 65 ; j <=(65+25) ; j++ ){
			System.out.print((char)(j) + "\t");
		}

	}
}

class Assignments8 {
	public static void main(String[] args){
		int symbol ;
		double sum = 0;
		for (int i = 1 ; i <= 100 ; i++){
			symbol = (i % 2 == 0)? (-1): 1 ;
			sum = sum + symbol * (1.0 / i );
			System.out.println("i = " + i + " ; symbol = " + symbol + " ; 1 / i = " + (1.0 / i ) + " ; sum = " + sum + " ;");
		}
		System.out.println(sum);
		
	}
}


class Assignments9 {
	public static void main(String[] args){
		int sum = 0 ;
		for (int i = 1 ; i <= 100 ; i ++){
			for(int j = 1 ; j <= i ; j++){
				sum += j ;
			}
		}
		System.out.println(sum);
		
	}
}