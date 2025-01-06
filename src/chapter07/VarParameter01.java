package chapter07;

public class VarParameter01 {
	public static void main(String[] args){
		Methods m = new Methods() ;
		System.out.println(m.sum(1,5));
		System.out.println(m.showScore("zhangsan" , 1,5));


	}
}

class Methods {
	public int sum(int... nums){
		int sum = 0 ;
		for(int i = 0 ; i < nums.length ; i++){
			sum += nums[i];
		}
		return sum ;
	} 
	public String showScore (String name , double... scores){
		double sumScore = 0 ;
		for(int i = 0 ; i < scores.length ; i++){
			sumScore += scores[i] ;
		}
		return name + " " + scores.length + " men ke de zongchengji shi " + sumScore ;
	}
}
