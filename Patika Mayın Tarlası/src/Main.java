import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen Satır Sayısını Giriniz : ");
		int korda = scan.nextInt();
		System.out.print("Lütfen Sütun Sayısını Giriniz : ");
		int kordb = scan.nextInt();
		
		MineSweeper game = new MineSweeper(korda, kordb);
		game.board();
		
		
		
	}

}
