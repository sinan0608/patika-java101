import java.util.Scanner;

public class CiftSayi {
	public static void main(String[] args) {
		int n,toplam=0;
		Scanner sayi= new Scanner(System.in);
		do {
			System.out.print("Lütfen bir sayı girin:");
			n = sayi.nextInt();
			if (n%4==0) {
				toplam += n; // Bu kod satırı  toplam= toplam + n; ile aynı anlama gelmektedir.
			}			
		}while(n%2==0);
		System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı=" +toplam);
	}

}
