public class Return01 {
	public static void main(String[] args){
		for (int i = 1 ; i <= 5 ; i++){
			if (i == 3){
				System.out.println("hanshunping " + i );
				// break ;
				// continue ;
				return ;
			}
			System.out.println("hello world");
		}
		System.out.println("go on ...");
	}
}
