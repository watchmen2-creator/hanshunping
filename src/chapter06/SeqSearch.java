import java.util.Scanner ;

public class SeqSearch {
	public static void main(String[] args){
		Scanner myscan = new Scanner(System.in);
		String[] arr = {"123" , "1qa" , "ashd" , "OK" , "ok"} ;
		String str  = "" ;
		aaa :
		while (true){
			System.out.println("Please enter a string to determine whether it is in the string array");
			str = myscan.next();
			for (int i = 0 ; i < arr.length ; i++){
				if (arr[i].equals(str)){
					System.out.println("Congratulations on finding it. It's in the "+ (i+1)+" position of the array");
					break aaa ;
				}
			}
			System.out.println("Not found. "+ str+" is not in the array");
		}		
		
	}
}
