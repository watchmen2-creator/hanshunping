import java.util.Random ;

public class Break01 {
	public static void main(String[] args){
		Random irandom = new Random();
		int i = 0;
		int j = 0 ;
		do{
			if(i == 97){
				break;
			}else{
				i = irandom.nextInt(101);
				System.out.println(i);
				j++ ;
			}

		}while (true);
		System.out.println(j);
	}
}

class Break02 {
	public static void main(String[] args){
		int num = 1 ;
		int count = 0 ; 
		while(true){			
			if(num == 97){
				break;
			}else{
				num = (int)(Math.random() * 100) + 1 ;
				System.out.println(num);
				count++ ;
			}
		}
		System.out.println(count + " times");
	}
}
