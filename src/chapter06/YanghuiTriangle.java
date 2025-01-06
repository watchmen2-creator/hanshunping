public class YanghuiTriangle {
	public static void main(String[] args){
		int [][] arr = new int [10][];
		int molecule = 1 ;  //fenzi
		int denominator = 1 ;  //fenmu
		int iclone ;
		for (int i = 0 ; i < arr.length ; i++){
			arr[i] = new int [i+1];
			arr[i][0] = 1 ;
			for (int j = 1 ; j < arr[i].length ; j++){
				// jisuan : fenmu
				for (int m = j ; m >= 1 ; m-- ){
					denominator *= m ;
				}
				// jisuan : fenzi 
				iclone = i ;
				for (int m = 1 ; m <=j  ; m++ ){					
					molecule *= iclone ;
					iclone-- ;
				}				
 				arr[i][j] = molecule / denominator ;
				
				molecule = 1 ;
				denominator = 1 ; 

			}
		}
		System.out.println("------------");
		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


class YanghuiTriangle02 {
	public static void main(String[] args){
		int [][] arr = new int [20][];		
		for (int i = 0 ; i < arr.length ; i++){
			arr[i] = new int [i+1];
			
			for (int j = 0 ; j < arr[i].length ; j++){
				if(j == 0 || j == arr[i].length - 1){
					arr[i][j] = 1 ;
				}else{
					arr[i][j] = arr[i - 1 ][j] + arr[i-1][j-1];
				}
			}
		}
		System.out.println("------------");
		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}