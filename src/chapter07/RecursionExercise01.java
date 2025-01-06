package chapter07;

public class RecursionExercise01 {
	public static void main(String[] args){
		Function fun = new Function();
		System.out.println("fibonacci");
		for (int i = 1 ; i <= 7 ; i++){
			System.out.println(fun.fibonacci(i));
		}

		System.out.println("monkeysEatPeaches");
		System.out.println(fun.monkeysEatPeaches(10));
		
		System.out.println("mouseOutMaze");
		int [][] maze = new int[8][7];
		//dingyi waiweiqiangbi 
		for (int i = 0 ;i < maze.length ; i++){
			for(int j = 0 ; j < maze[i].length ; j++){
				if(i == 0 || i == maze.length - 1 || j == 0 || j == maze[i].length - 1){
					maze[i][j] = -1 ;
				}
			}
		}

		//dingyi neibuqiangbi
		maze[3][1] = -1 ;
		maze[3][2] = -1 ;
		// maze[1][2] = -1 ;
		maze[2][2] = -1 ;
		// maze[2][3] = -1 ;
		// maze[5][4] = -1 ;
		// maze[5][5] = -1 ;
		// maze[2][4] = -1 ;
		// maze[2][5] = -1 ;


		fun.findWay(maze , 1 , 1 );
		// fun.mouseOutMaze(maze , 1 , 1 );

		for (int a = 0 ;a < maze.length ; a++){
			for(int b = 0 ; b < maze[a].length ; b++){
				System.out.print(maze[a][b] + "\t");
			}
			System.out.println();
		}

		System.out.println("HanoiTower");
		Plate[] p = new Plate[5];
		for (int i = 0 ; i < p.length ; i++){
			p[i] = new Plate() ;
			p[i].size = i+1 ;
			p[i].position = 'A' ;
		}

		fun.printHanoiTower(p);
		fun.HanoiTower(p , p[0].position , 'B' , 'C');
		fun.printHanoiTower(p);

		System.out.println("Eight Queens");
		int [][] chessboard = new int[8][8];
		chessboard[1][1] = 1 ;
		fun.eightQueens(chessboard);
		for(int i = 0 ; i < 8 ; i++){
			for(int j = 0 ; j < 8 ; j++){
				System.out.print(chessboard[i][j]);
			}
			System.out.println();
		}


	}
}

class Plate{
	int size ;
	char position ;
}

class Function{
	public int fibonacci(int n){
		if( n == 1 || n == 2 ){
			return 1 ;
		}else{
			return fibonacci( n - 1 ) + fibonacci( n - 2 ) ;
		}
	}

	public int monkeysEatPeaches(int day){		
		if(day == 1 ){
			return 1;
		}
		return (monkeysEatPeaches(day - 1) + 1 )  * 2;		
	}

	public boolean mouseOutMaze(int [][]  map , int x , int y){
		return true ;
	}

	/*
		map shi ditu ,x \ y shi weizhi
		0 > keyizou ; -1 > buneng zou ; 1 > keyizou tongde lu ; 2 > zouguodanshizoubutong 
	*/
	public boolean findWay(int [][] map , int x , int y ){
		if(map[6][5] == 1){
			return true ;
		}else{
			if(map[x][y] == 0){
				map[x][y] = 1 ;
				if(findWay(map , x + 1 , y)){
					return true ;
				}else if(findWay(map , x , y + 1)){
					return true ;
				}else if(findWay(map , x - 1 , y)){
					return true ;
				}else if(findWay(map , x , y - 1)){
					return true ;
				}else{
					map[x][y] = 2 ;
					return false ;
				}
			}else {//-1\1\2
				return false ;
			}
		}
	}

	public void printHanoiTower(Plate[] p){
		System.out.println("A\tB\tC");
		for(int i = 0 ; i < p.length ; i++){
			switch(p[i].position){
			case 'A':{
				System.out.println(p[i].size + "\t \t ");
				break ;
			}case 'B':{
				System.out.println(" \t" + p[i].size + "\t ");
				break ;
			}case 'C':{
				System.out.println(" \t \t" + p[i].size );
				break ;
			}
			}
		}
		System.out.println("**************************");
	}

	public void HanoiTower(Plate[] p , char currentPosition , char targetPosition , char auxiliaryPosition){
		if(p.length == 1 ){
			p[0].position = targetPosition ;
		}else{
			Plate[] pc  = new Plate[p.length - 1 ] ;
			for(int i = 0 ; i < pc.length ; i++ ){
				pc[i] = p[i] ;
			}
			HanoiTower(pc ,pc[0].position , auxiliaryPosition ,targetPosition );
			// printHanoiTower(p);
			p[p.length-1].position = targetPosition ;
			// printHanoiTower(p);
			HanoiTower(pc ,auxiliaryPosition , targetPosition ,currentPosition );
			// printHanoiTower(p);
		}
	}

	public void eightQueens(int [][] chessboard){
		

	}


}