public class ArrayCopy {
	public static void main(String[] args){
		int[] arr1 = {10 , 20,  30};
		int[] arr2 = new int[arr1.length];
		for (int i = 0 ; i < arr1.length ; i++){
			arr2[i] = arr1[i];
		}
		System.out.println("ok");
		for (int i = 0 ; i < arr2.length ; i++){
			arr2[i] ++ ;
			System.out.println(arr2[i]);
		}
		for (int i = 0 ; i < arr1.length ; i++){			
			System.out.println(arr1[i]);
		}
	}
}

class ArrayReverse{
	public static void main(String[] args){
		// int [] arr = {11 , 22 , 33 , 44 , 55 , 66 };
		int [] arr = {11 , 22 , 33 , 44 , 55 };
		int arrLength = arr.length;
		int temp ;
		for (int i = 0 ; i < arrLength / 2 ; i++){
			temp = arr[i] ;
			arr[i] = arr[arrLength - 1 -i ];
			arr[arrLength - 1 -i ] = temp ;
		}
		for (int i = 0 ; i < arrLength ; i++){
			System.out.println(arr[i]);
		}

		System.out.println("The second method is as follows");
		int[] arrTool = new int[arrLength] ;
		for (int i = 0 ; i < arrLength   ; i++){
			arrTool[i] = arr[arrLength - 1 - i] ;
		}
		arr = arrTool ; 
		for(int i = 0 ; i < arrLength ; i++){
			System.out.print(arrTool[i] + "\t");
		}
		System.out.println("0000000");
		for(int i = 0 ; i < arrLength ; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println("00000001111111111");
	}
}
