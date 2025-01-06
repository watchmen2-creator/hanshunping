public class ConStructor {
	public static void main(String[] args){
		Person p1 = new Person("jack" , 15 );
		Person p2 = new Person("lucy" );		
		Person p3 = new Person();		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.hashCode());

		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.hashCode());

		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.hashCode());

	}
}


class Person {
	String name ;
	int age ;
	Person(){
		age = 18 ;
		System.out.println("hashCode = " + this.hashCode());
	}
	Person(String name , int age){
		this.name = name ;
		this.age = age ;
		System.out.println("hashCode = " + this.hashCode());
	}
	Person(String objName ){
		name = objName ;
		age = 18 ;
		System.out.println("hashCode = " + this.hashCode());
	}
}
