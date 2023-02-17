import java.util.Scanner;

public class Harmonik {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N sayısını Giriniz :");
		int n = input.nextInt();
		double result = 0;
		for (int i = 1 ; i<=n ; i++) {
		   result += (1.0/i); // int değer bölündüğünde int bir değer bekliyor ancak double bir sayı gelmesi gerkiyor.
		   					 // bu nedenle double'ı integer a bölmemiz gerikiyor yani 1.0 şeklinde yazmamız gerek.
		   					// yada int i değil, double i olarak tanımlamamız gerekiyor.
		   				   //bu işlemler yapılamadan işlem yapılırsa  gelen değer hep 1.0 olur. 
		}
		System.out.println(result);
	}
}
