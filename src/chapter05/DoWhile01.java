import java.util.Scanner ;
import java.util.Random ;

public class DoWhile01 {
	public static void main(String[] args){
		Scanner iScan = new Scanner(System.in) ;

		System.out.println("please input start num ");
		int startNum = iScan.nextInt();

		System.out.println("please input end num ");
		int endNum = iScan.nextInt();

		int i = startNum ;
		int sum = 0 ;
		do {
			System.out.println(i);
			sum += i ;
			i++ ;
		} while(i <= endNum);
		System.out.println("sum is :" + sum);
		System.out.println("while is execute ouver;");
	}
}

class DoWhileExercise {
	public static void main(String[] args){
		Scanner iScan = new Scanner(System.in) ;

		System.out.println("please input start num ");
		int startNum = iScan.nextInt();

		System.out.println("please input end num ");
		int endNum = iScan.nextInt();

		System.out.println("please input could % num ");
		int couldMoNUm = iScan.nextInt();

		System.out.println("please input not could % num");
		int NotCouldMoNum = iScan.nextInt();

		int i = startNum ;
		int count = 0 ;
		do {
			if((i % couldMoNUm == 0) && (i % NotCouldMoNum != 0) ){
				System.out.println(i);
				count++;
			}			
			i++ ;
		} while(i <= endNum);
		System.out.println("count is :" + count);
		System.out.println("while is execute ouver;");
	}
}

class DoWhileExercise02 {
	public static void main(String[] args){
		Random iRandom = new Random();
		int i = 1 ;
		int j ;
		do {
			System.out.println("huanqian , da ni " + i + " lianbian");
			j = iRandom.nextInt(2);
			System.out.println("the random num is :" + j);
			if( j == 1){
				System.out.println("huanqian");
			}else{
				System.out.println("buhuanqian");
			}
			i++ ;

		}while(j != 1);
		System.out.println("da le " + (i - 1) + " lianbian ,jiuhuanqianle");
		//System.out.println(iRandom.nextInt(2));
	}
}
