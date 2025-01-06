import java.util.Scanner ;

public class Object01 {
	public static void main(String[] args){
		Scanner iscan = new Scanner(System.in);
		System.out.println("Please enter the kitten's name");
		String catName = iscan.next();
		if("white".equals(catName)){
			System.out.println(catName + "'s name is "+ catName +" , age: 3, color: white");
		}else if("flower".equals(catName)){
			System.out.println(catName + "'s name is "+ catName +" , age: 100, color: flower");
		}else{
			System.out.println("Mrs. Zhang doesn't have this cat");
		}

		Cat objCat1 = new Cat() ;
		objCat1.name = "xiao bai" ;
		objCat1.age = 3 ;
		objCat1.color = "white" ;
		Cat objCat2 = new Cat() ;
		objCat2.name = "xiao hua" ;
		objCat2.age = 100 ;
		objCat2.color = "flower" ;


	}
}


class Cat{
	String name ;
	int age ;
	String color ;
}
