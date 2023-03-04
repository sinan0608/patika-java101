import java.util.Scanner;

public class MukemmelSayı {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,toplam=0;
		System.out.print("Lütfen Bir Sayı Giriniz :");
		a= scan.nextInt();
		
		for (int i=1; i<a; i++) {
			if (a%i==0) {
				toplam +=i;		
			}
		}
		if (toplam == a) {
			System.out.println(a+" Sayısı Mükemmel Sayıdır.");
		}else {
			System.out.println(a+" Sayısı Mükemmel Sayı Değildir.");
		}
		
	}

}
