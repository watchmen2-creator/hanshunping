package chapter06;

import java.util.Scanner ;

public class ArrayAdd {
	public static void main(String[] args){
		Scanner myscan = new Scanner(System.in );

		int [] arr = {1 , 2 , 3};
		int length = arr.length;
		int [] arrTool ;
		int addElement ; 
		String enterResult ;

		do{
			System.out.print("The elements of array arr are now:");
			for (int i = 0 ; i < length ; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("Do you need to add elements? yes / no" );
			enterResult = myscan.next();
			if("yes".equals(enterResult)){
				System.out.println("Please enter the added element");
				addElement = myscan.nextInt();
				arrTool = new int[length + 1 ];
				for (int i = 0 ; i <length ; i++){
					arrTool[i] = arr[i];
				}
				arrTool[length] = addElement ;
				arr = arrTool ; 
				length = arr.length;
				continue;
			}
			// else if("no".equals(enterResult)){
			// 	System.out.println("exit");
			// 	break;
			// }
			else if (! "no".equals(enterResult)){
				System.out.println("Input error");
			}
		}while(! "no".equals(enterResult));
		System.out.println("exit");
	}
}


class ArrayReduce{
	public static void main(String[] args){
		Scanner myscan = new Scanner(System.in );
		int [] arr = {1 , 2 , 3 , 4 , 5 } ;
		int length = arr.length;
		int [] arrTool ;
		// int addElement ; 
		String enterResult ;
		while(true){
			System.out.print("The elements of array arr are now:");
			for (int i = 0 ; i < length ; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("Would you like to remove the last element ? yes / no" );
			enterResult = myscan.next();
			if("yes".equals(enterResult)){
				if(length == 1 ) {
					System.out.println("There's only one element left in the array, so we can't reduce it any more");
					break ; 
				}				
				arrTool = new int[length - 1 ];
				length = arrTool.length;
				for (int i = 0 ; i <length ; i++){
					arrTool[i] = arr[i];
				}				
				arr = arrTool ; 				
				continue;
			}else if("no".equals(enterResult)){
				System.out.println("exit");
				break;
			}else{
				System.out.println("Input error");
			}
		}

	}
}