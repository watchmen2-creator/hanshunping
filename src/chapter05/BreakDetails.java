import java.util.Scanner ;

public class BreakDetails {
	public static void main(String[] args){
		lable1 :
		for(int i = 0 ; i <= 10 ; i++){
			lable2 :
			for(int j = i ; j <= 10 ; j++){
				System.out.println("i = " + i + "  j = " + j);
				if ((i + j) == 10 ){
					System.out.println("okokokookkkkkkk");
					break lable2;
				}else{

				}
			}
		}
	}
}

class BreakExercise01 {
	public static void main(String[] args){
		int sum = 0 ;
		for(int i = 1 ; i <= 100 ; i++ ){
			sum += i ;
			if(sum >= 20){
				System.out.println(i);
				break;			
			}
		}
	}
}


class BreakExercise02 {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);
		System.out.println("Please enter your username");
		String loginName = "" ;
		String password = "" ;
		loop1:
		for (int i = 3 ;i >= 1 ; i--){			
			loginName = iscan.next();
			if("dingzhen".equals(loginName)){
				System.out.println("Please enter your password");
				loop2:
				for(int j = 1 ; j <= 3 ; j++){
					password = iscan.next();
					if("666".equals(password)){
						System.out.println("Login successful");
						break loop1 ;
					}else{
						System.out.println("Password is incorrect, there are " + (4 - j) + " more chances to enter, please re-enter:");
					}
				}
			}else{
				System.out.println("User name does not exist,there are " + i + " more chances to enter,  please re-enter");
			}
		}
	}
}

