package chapter07;

public class TestPerson {
	public static void main(String[] args){
		Person p1 = new Person("zhangsan" , 15) ;
		Person p2 = new Person("lisi" , 55) ;
		Person p3 = new Person("lisa" , 25) ;
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.compareTo(p3));
		System.out.println(p1.compareTo(p1));
	}
}

class Person {
	String name ;
	int age ;
	public Person (String name , int age ){
		this.name = name ;
		this.age = age ;
	}
	public boolean compareTo(Person p){
		return this.name.equals(p.name) && this.age == p.age ;		
	}
}