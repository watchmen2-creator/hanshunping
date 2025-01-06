package chapter07.homework;

import java.util.Random ;
import java.util.Scanner ;


public class HomeWork {
	public static void main(String[] args){
		System.out.println("************************");
		System.out.println("HomeWork01");
		HomeWork01 h1 = new HomeWork01();
		// double[] nums = {1.0 , 55 , 32.5 , 99.9 , 45.7 , 0 , 0.0 , 0.02 , -89 , -9.5 } ;
		double[] nums = null ;
		// double[] nums = {} ;
		Double res = h1.max(nums) ;
		if(res != null){
			System.out.println( " the max num of nums is : " + res);
		}else{
			System.out.println( "nums is null " );
		}		


		System.out.println("************************");
		System.out.println("HomeWork02");
		HomeWork02 h2 = new HomeWork02();
		// String[] strs = {"zhangsan" , "lisi" , "wangwu" , "zhangchulan" } ;
		// String[] strs = {} ;
		String[] strs = null ;
		if(h2.find(strs , "lisi22") != null){
			System.out.println(h2.find(strs , "lisi22"));
		}else{
			System.out.println("strs is null or {}");
		}
		

		System.out.println("************************");
		System.out.println("HomeWork03");
		HomeWork03 h3_1 = new HomeWork03(188.8) ;
		h3_1.showInfo();		
		h3_1.updatePrince();
		h3_1.showInfo();
		HomeWork03 h3_2 = new HomeWork03(150.0) ;
		h3_2.showInfo();		
		h3_2.updatePrince();
		h3_2.showInfo();
		HomeWork03 h3_3 = new HomeWork03(125.7) ;
		h3_3.showInfo();		
		h3_3.updatePrince();
		h3_3.showInfo();
		HomeWork03 h3_4 = new HomeWork03(100.0) ;
		h3_4.showInfo();		
		h3_4.updatePrince();
		h3_4.showInfo();
		HomeWork03 h3_5 = new HomeWork03(50.0) ;
		h3_5.showInfo();		
		h3_5.updatePrince();
		h3_5.showInfo();


		System.out.println("************************");
		System.out.println("HomeWork04");
		HomeWork04 h4 = new HomeWork04();
		// int[] oldArr1 = { 1 , 4 , 5 , 2} ;		
		int[] oldArr1 = { } ;		
		int[] resArr1 = h4.copyArr(oldArr1);		
		h4.showArr(resArr1);
		double[] oldArr2 = { 1.7 , 5.4 , 20.5 , 0.2} ;		
		double[] resArr2 = h4.copyArr(oldArr2);		
		h4.showArr(resArr2);
		String[] oldArr3 = { "1.7zhangsan" , "5.4XXXXXX , 20.5 "} ;		
		String[] resArr3 = h4.copyArr(oldArr3);		
		h4.showArr(resArr3);

		System.out.println("************************");
		System.out.println("HomeWork05");
		HomeWork05 h5 = new HomeWork05(1);
		System.out.println(h5.perimeter());
		System.out.println(h5.area());

		System.out.println("************************");
		System.out.println("HomeWork06");
		HomeWork06 h6 = new HomeWork06(1.0 , 5.3);
		// HomeWork06 h6 = new HomeWork06(1.0 , 0);
		System.out.println(h6.add());
		System.out.println(h6.minus());
		System.out.println(h6.multiply());
		System.out.println(h6.divide());


		System.out.println("************************");
		System.out.println("HomeWork08") ;
		new HomeWork08().count1(); //10
		HomeWork08 h8 = new HomeWork08() ;
		h8.count2() ;//9
		h8.count2() ;//10


		System.out.println("************************");
		System.out.println("HomeWork09") ;
		HomeWork09 h9 = new HomeWork09("xiaoaojianghu" , 300) ;
		h9.play();
		h9.getInfo();


		System.out.println("************************");
		System.out.println("HomeWork10") ;
		HomeWork10 h10_1 = new HomeWork10();
		HomeWork10 h10_2 = h10_1 ;
		h10_2.m(); // i = 101 j = 100 
		System.out.println(h10_1.i); // 101
		System.out.println(h10_2.i); // 101


		System.out.println("************************");
		System.out.println("HomeWork11") ;
		HomeWork11 h11 = new HomeWork11();
		System.out.println(h11.method(h11.method(10.0 , 20.0) , 100));


		System.out.println("************************");
		System.out.println("HomeWork12") ;
		HomeWork12 h12_1 = new HomeWork12 ("zahngsan" , 'W' , 24);
		h12_1.show() ;
		HomeWork12 h12_2 = new HomeWork12 ("boss" , 50000.12 );
		h12_2.show() ;
		HomeWork12 h12_3 = new HomeWork12 ("lina" , 'M' , 32 , "taxi driver" , 18546.78 );
		h12_3.show() ;


		System.out.println("************************");
		System.out.println("HomeWork14") ;
		HomeWork14 h14 = new HomeWork14();
		Scanner iscan = new Scanner(System.in);
		int count1 = 0 ;
		int count0 = 0 ;
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println("Come and play with computer, please enter one of the scissors, rock, paper, 0 for rock, 1 for scissors, 2 for paper, tom will randomly choose one of them, let's see who wins more");
			switch(h14.play(iscan.nextInt())){
			case 1 : {
				count1++ ;
				System.out.println("Game " + i + ", you win . " + (10 - i) + " games left" );
				System.out.println("you win " + count1 + " games , lost " + (i - count1 - count0) + " games and drew " + count0 + " games");
				System.out.println("computer win " + (i - count1 - count0) + " games , lost " + count1 + " games and drew " + count0 + " games");
				break ;
			}case 0 : {
				count0++ ;
				System.out.println("Game " + i + ", you and computer drew . " + (10 - i) + " games left" );
				System.out.println("you win " + count1 + " games , lost " + (i - count1 - count0) + " games and drew " + count0 + " games");
				System.out.println("computer win " + (i - count1 - count0) + " games , lost " + count1 + " games and drew " + count0 + " games");
				break ;
			}case -1 : {
				System.out.println("Game " + i + ", you lost . " + (10 - i) + " games left" );
				System.out.println("you win " + count1 + " games , lost " + (i - count1 - count0) + " games and drew " + count0 + " games");
				System.out.println("computer win " + (i - count1 - count0) + " games , lost " + count1 + " games and drew " + count0 + " games");
				break ;
			}
			}
			


		}



	}
}

class HomeWork01 {
	public Double max(double[] nums){
		if(nums != null && nums.length > 0){
			double maxNum = nums[0];
			for (int i = 0 ; i < nums.length ; i++){
				maxNum = maxNum > nums[i] ? maxNum : nums[i] ;
			}
			return maxNum ;
		}else{
			return null ;
		}
		
		
	}
}

class HomeWork02 {
	public Integer find(String[] strs , String str){
		if(strs != null && strs.length > 0){
			int index = -1 ;
			for (int i = 0 ; i < strs.length ; i++){
				index = str.equals(strs[i]) ? i : index ;
			}
			return index ;
		}else{
			return null ;
		}
	}
}

class HomeWork03 {
	double price ;
	public HomeWork03(double price){
		this.price = price ;
	}
	public void updatePrince(){
		this.price = this.price > 100 ? ( this.price > 150 ? 150 : 100 ) : this.price ;
		
	}
	public void showInfo(){
		System.out.println("the price of this book is : " + this.price );
	}
}

class HomeWork04 {

	public int[] copyArr (int[] arr){
		int [] copyArr = new int[arr.length] ;
		for (int i = 0 ; i < arr.length ; i++){
			copyArr[i] = arr[i] ;
		}
		return copyArr ;		
	}

	public double[] copyArr (double[] arr){
		double [] copyArr = new double[arr.length] ;
		for (int i = 0 ; i < arr.length ; i++){
			copyArr[i] = arr[i] ;
		}
		return copyArr ;
	}

	public String[] copyArr (String[] arr){
		String [] copyArr = new String[arr.length] ;
		for (int i = 0 ; i < arr.length ; i++){
			copyArr[i] = arr[i] ;
		}
		return copyArr ;
	}

	public void showArr (int[] arr){
		if(arr != null && arr.length > 0){
			for (int i = 0 ; i < arr.length ; i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}else{
			System.out.println("arr is null or {}");
		}
	}

	public void showArr (double[] arr){
		if(arr != null && arr.length > 0){
			for (int i = 0 ; i < arr.length ; i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}else{
			System.out.println("arr is null or {}");
		}
	}

	public void showArr (String[] arr){
		if(arr != null && arr.length > 0){
			for (int i = 0 ; i < arr.length ; i++){
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
		}else{
			System.out.println("arr is null or {}");
		}
	}

}

class HomeWork05 {	
	double radius ;
	public HomeWork05 (double radius){
		this.radius = radius ;
	}
	public double perimeter(){
		return 2 * Math.PI * radius ;
	}
	public double area(){
		return Math.PI * radius * radius ;
	}
}

class HomeWork06 {	
	double num1  , num2 ;
	public HomeWork06 (double num1 , double num2 ){
		this.num1 = num1 ;
		this.num2 = num2 ;
	}
	public double add (){
		return num1 + num2 ;
	}
	public double minus(){
		return num1 - num2 ;
	}
	public double multiply(){
		return num1 * num2 ;
	}
	public Double divide(){
		if(num2 == 0 ){
			System.out.println("error");
			return null ;
		}else{
			return num1 / num2 ;			
		}
	}
}

class HomeWork07 {	
	String name ;
	String color ;
	int age ;
	public HomeWork07 (String name , String color , int age){
		this.name = name ;
		this.color = color ;
		this.age = age ;
	}
	public void show (){
		System.out.println("this.name : " + this.name ) ;
		System.out.println("this.color : " + this.color ) ;
		System.out.println("this.age : " + this.age ) ;
	}
}

class HomeWork08 {	
	int count = 9 ;
	public void count1 (){
		count = 10 ;
		System.out.println("count1 = " + count ) ;
	}
	public void count2 (){
		System.out.println("count1 = " + count++ ) ;
	}
}

class HomeWork09 {	
	String name ;
	double times ;
	public HomeWork09(String name ,double times ){
		this.name = name ;
		this.times = times ;
	}
	public void play (){
		System.out.println("this.name : " + this.name ) ;
		System.out.println("this.times : " + this.times ) ;
		System.out.println("123456789") ;
	}
	
	public void getInfo (){
		System.out.println("this.name : " + this.name ) ;
		System.out.println("this.times : " + this.times ) ;
	}
}

class HomeWork10 {	
	int i = 100 ;
	public void m (){
		int j = i++ ;
		System.out.println("i = " + i ) ;
		System.out.println("j = " + j ) ;
	}	
}

class HomeWork11 {
	public double method (double n1 , double n2){
		return n1 + n2 ; 
	}
}

class HomeWork12 {
	String name ;
	char sex ;
	int age ;
	String position ;
	double salary ;
	public HomeWork12 (String name , char sex , int age ){
		this.name = name ;
		this.sex = sex ;
		this.age = age ;
	}
	public HomeWork12 (String position , double salary ){
		this.position = position ;
		this.salary = salary ;
	}
	public HomeWork12 (String name , char sex , int age , String position , double salary ){
		this( name , sex , age ) ;
		this.position = position ;
		this.salary = salary ;
	}
	public void show (){
		System.out.println("--------------------" );
		System.out.println("name :" + this.name );
		System.out.println("sex :" + this.sex );
		System.out.println("age :" + this.age );
		System.out.println("position :" + this.position );
		System.out.println("salary :" + this.salary );
		System.out.println("--------------------" );

	}
}

class HomeWork13 {
	public static void main(String[] args){
		Circle c = new Circle(1);
		PassObject p = new PassObject() ;
		p.printAreas(c , 5)  ;
		System.out.println(c.radius);

	}
}

class Circle {
	double radius ;
	public Circle (double radius){
		this.radius = radius ;
	}
	public void setRadius(double radius){
		this.radius = radius ;
	}
	public double findArea (){
		return Math.PI * this.radius * this.radius ;
	}
}

class PassObject {
	public void printAreas(Circle c , int times){
		System.out.println("Radius\tArea");
		for (int i = 1 ; i <= times ; i++){
			c.setRadius(i);
			System.out.println( c.radius + "\t" + c.findArea() );
		}
	}
}

class HomeWork14 {
	Random iran = new Random() ;
	int res ;
	public int  play (int tom){
		this.res = iran.nextInt(3);
		switch(this.res){
		case 0 : {
			switch(tom){
			case 0 : {
				return 0 ;
			}case 1 : {
				return -1 ;
			}case 2 :{
				return 1 ;
			}
			}
		}case 1 : {
			switch(tom){
			case 0 : {
				return 1 ;
			}case 1 : {
				return 0 ;
			}case 2 :{
				return -1 ;
			}
			}
		}case 2 : {
			switch(tom){
			case 0 : {
				return -1 ;
			}case 1 : {
				return 1 ;
			}case 2 :{
				return 0 ;
			}
			}
		}
		}
		return 0 ;
	}
}