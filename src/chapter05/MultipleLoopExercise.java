package chapter05;

import java.util.Scanner ;

public class MultipleLoopExercise {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);

		System.out.println("Please enter how many classes there are ?");
		int classNum = iscan.nextInt();
		System.out.println("Please enter what the qualifying score is ?");
		double passScore = iscan.nextDouble();
				
		double allAverage = 0 ;
		for(int i = 1 ; i <= classNum ; i++){
			double classTotalScore = 0 ;
			double classAverage = 0 ;
			int passNumber = 0 ;
			System.out.println("How many students are there in the " + i +" class");
			int studentNum = iscan.nextInt();
			for(int s = 1 ; s <= studentNum ; s++){
				System.out.println("Please enter the score of the " + s + " student in the " + i + " class");
				double studentScore = iscan.nextDouble();
				if(studentScore >= passScore){
					passNumber++;
				}
				classTotalScore += studentScore ;
			}
			classAverage = classTotalScore / studentNum ;
			System.out.println("The number of qualified students in the " + i +" class is " + passNumber) ;
			System.out.println("The average score of the " + i +" class is " + classAverage) ;
			allAverage += classAverage ;
		}
		allAverage /= classNum ;
		System.out.println("The average score for all classes was " + allAverage);
	}
}


class MultiplicationTable{
	public static void main(String[] args){
		for(int i = 1 ; i <= 9 ; i++){
			for (int j = 1 ; j <= i ; j++){
				System.out.print(i + " * " + j + " = " + (i*j) + "\t" );

			}
			System.out.println();
		}
	}
}

class PrintPyramid{
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);

		System.out.println("Please enter the number of layers of the pyramid ?");
		int totalLevel = iscan.nextInt();
		int NumberLayers = 2 * totalLevel - 1 ;
		for(int i = 1 ; i <= totalLevel ; i++){
			for(int j = 1 ; j <= NumberLayers ; j++){				
				if(j >= ( totalLevel - i + 1 ) && j <= ( totalLevel + i - 1 ) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

		for(int i = 1 ; i <= totalLevel ; i++){
			for(int j = 1 ; j <= NumberLayers ; j++){
				if(i == totalLevel ){
					if(j >= ( totalLevel - i + 1 ) && j <= ( totalLevel + i - 1 ) ){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					if(j == ( totalLevel - i + 1 ) || j == ( totalLevel + i - 1 ) ){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}	
				
				
			}
			System.out.println();
		}

	}
}

class PrintDiamond{
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);

		System.out.println("Please enter the number of layers of the diamond ?");
		int totalLevel = iscan.nextInt();

		int NumberLayers = 2 * totalLevel - 1 ;

		for(int i = 1 ; i <= totalLevel ; i++){
			for(int j = 1 ; j <= NumberLayers ; j++){				
				if(j >= ( totalLevel - i + 1 ) && j <= ( totalLevel + i - 1 ) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1 ; i <= (totalLevel - 1) ; i++){
			for(int j = 1 ; j <= NumberLayers ; j++){				
				if(j >= ( i + 1 ) && j <= ( NumberLayers - i ) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i = 1 ; i <= totalLevel ; i++){
			for(int j = 1 ; j <= NumberLayers ; j++){				
				if(j == ( totalLevel - i + 1 ) || j == ( totalLevel + i - 1 ) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1 ; i <= (totalLevel - 1) ; i++){
			for(int j = 1 ; j <= NumberLayers ; j++){				
				if(j == ( i + 1 ) || j == ( NumberLayers - i ) ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


			
	}
}


