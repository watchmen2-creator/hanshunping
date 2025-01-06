package chapter07;

public class PropertiesDetails {
	public static void main(String[] args){
		Person2 p1 = new Person2() ;
		System.out.println("Person's default information is :");
		System.out.println("age = " + p1.age + "; name = " + p1.name + "; sal = " + p1.sal + "; isPass = " + p1.isPass);
	}
}

class Person2{
	int age ;
	String name ;
	double sal ;
	boolean isPass ;
}
