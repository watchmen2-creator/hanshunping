public class TwoDimensionalArray02 {
	public static void main(String[] args){
		// int [] [] arr = new int [2][3] ;
		int [] [] arr = {{1 } , { 1, 2 } , { 1 , 2 , 3 }};

		for (int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		arr[1][1] = 8;
		System.out.println(arr[1][1]);
	}
}


class TwoDimensionalArray03{
	public static void main(String[] args){
		int [][] arr = {{4 , 6 } , { 1 , 4 , 5 , 7 } , {-2}};
		int sum = 0 ;
		for (int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}