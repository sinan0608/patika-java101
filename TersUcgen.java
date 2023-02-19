import java.util.Scanner;

public class TersUcgen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz :");
		int n= scan.nextInt();
		int d=n;
		
		for (int i=1; i<=d; i++) {
			for (int j=0 ;j<=i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=(2*n)-1; k++) {
				System.out.print("*");				
			}
			System.out.println();
			n--;
		}
		
	}
}
