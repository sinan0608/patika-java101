import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	Scanner scan = new Scanner(System.in);
	int row;
	int col;
	int elemansayısı;
	int mayınsayısı;
	int mineROW;
	int mineCol;	
	String [][] board;
	String [][] mineBoard;
	int korda;
	int kordb;
	int satır;
	int sutun;
	int count=0;
	
	
	
	
	MineSweeper(int row, int col){
		this.row = row;
		this.col = col;
		this.board = new String [this.row][this.col];
		this.mineBoard = new String [this.row][this.col];
		elemansayısı = this.row*this.col;
		mayınsayısı = elemansayısı/4;
	}
	
	void board() {
		for (int i=0 ; i< this.board.length ; i++) {
			for ( int j=0 ; j< this.board[0].length ; j++) {
				this.board[i][j] = "-"; 
				
			}
		}
		randomMine();
		printInfo();
		run();
	}
	
	
	
	void randomMine() {
		Random rand = new Random();
		int n =1;
		while ( n<= mayınsayısı ) {
		
		this.mineROW = rand.nextInt(this.row);
		this.mineCol = rand.nextInt(this.col);
		// aynı koordinata tekrar mayın atamaması için if döngüsü yazdım.
		if (!this.board[this.mineROW][this.mineCol].equals("*") ) {
		this.board [this.mineROW][this.mineCol] = "*";
		this.mineBoard [this.mineROW][this.mineCol] = this.board [this.mineROW][this.mineCol];
		n++;
		}
		
		}
	}
	
	void run() {
		System.out.print("Lütfen Bir Satır Koordinatı Giriniz : ");
		this.satır = scan.nextInt();
		System.out.print("Lütfen Bir Sutun Koordinatı Giriniz : ");
		this.sutun = scan.nextInt();
		isInside();
		
	}
	
	
	boolean isInside () {
		if ((this.satır < this.row && this.satır>=0) && ( this.sutun< this.col && this.sutun>=0 )) {
			
			IsMıne();
			return true;
		}else {
			System.out.println("Girdiğiniz Koordinat Değerleri Yanlış");
			run();
			return false;
		}
		
	}
	
	
	boolean IsMıne() {
				
	if(this.board[satır][sutun].equals("*")){
		System.out.println("!!!GAME OVER!!!!");
		return false;
		
	}else {
		count ++;
		this.count = count;
		
		int bomb=0;
		for ( int i=-1 ; i< 2 ; i++) {
			for ( int j=-1 ; j< 2 ; j++) {
				if ( (satır+i >=0 && satır+ i< this.row) && ( sutun+j >= 0 && sutun+j < this.col) ) {
				if (this.board[satır+i][sutun+j].equals("*")) {
				bomb++;
				
				}
				
				}		
				this.board[satır][sutun] = String.valueOf(bomb);
			}
			
		}
		
		if (bomb==0) {
			this.board[satır][sutun] = String.valueOf(0);
			
		}
		printInfo();
		if(isWin()) {
		
		
		}else {
			run();
		}
		
		
		
		
		return true;
	}
	}
	
	
	
	boolean isWin() {
		if (count == (elemansayısı-mayınsayısı)) {
			System.out.println("Kazandınız Tebrikler!!!");
		return true;
		}else
			return false;
	}
	
	
	
	void printInfo() {
		for (int i=0 ; i< this.board.length ; i++) {
			for (int j=0 ; j< this.board[i].length ; j++) {
				System.out.print(this.board[i][j]+" ");
			}
			System.out.println();
		}
	}

	

}
