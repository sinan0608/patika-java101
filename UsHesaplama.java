
import java.util.Scanner;

public class UsHesaplama {
	static int us(int a, int b) {
		int hesap=1;
		for (int i=1; i<=b ; i++) {
			hesap *=a;
		}
		return hesap;
	}
	
	public static void main(String[] args) {
		Scanner deger = new Scanner(System.in);
		
		while(true) {
			int a,b;
			System.out.print("Taban degerini giriniz :");
			a = deger.nextInt();
			System.out.print("Üs degerini giriniz :");
			b = deger.nextInt();
			if (a==0 || b==0) {
				System.out.println("Belirsizlik");
				break;
			}
			System.out.println("Sonuç = "+ us(a,b));
			
		}		
	}
}


