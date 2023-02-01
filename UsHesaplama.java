import java.util.Scanner ;

public class UsHesaplama {
	public static void main(String[] args) {
		int n,k,sayi=1;
		Scanner kuvvet = new Scanner(System.in);
		System.out.print("Lütfen taban degerini girin: ");
		k = kuvvet.nextInt();
		System.out.print("Lütfen üs degerini giriniz: ");
		n = kuvvet.nextInt(); // üs degeri
		
		for (int i=1 ; i<=n ; i++) {
		sayi *=k;
		}
		
		System.out.print("sonuç= " +sayi );	
	}
}
