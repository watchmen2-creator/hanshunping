package chapter07;

public class ConStructor {
	public static void main(String[] args){
		Person_ p1 = new Person_("jack" , 15 );
		Person_ p2 = new Person_("lucy" );
		Person_ p3 = new Person_();
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


class Person_ {
	String name ;
	int age ;
	Person_(){
		age = 18 ;
		System.out.println("hashCode = " + this.hashCode());
	}
	Person_(String name , int age){
		this.name = name ;
		this.age = age ;
		System.out.println("hashCode = " + this.hashCode());
	}
	Person_(String objName ){
		name = objName ;
		age = 18 ;
		System.out.println("hashCode = " + this.hashCode());
	}
}
