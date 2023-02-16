import java.util.Scanner;

public class RecursiveDesen {
	
	static void desen(int a ,int b) {
		if (a>0) {
			System.out.print(a);
			desen(a-5, b); //kendisini tekrar çağırdı metotun başına döndü
		}
		if (a<=0) {
			desen2(a, b); // a'nın sıfır veya negatig olan değerini ekrana yazdırıyor.
		}
        
	}
	static void desen2(int a,int b) { // a değeri b değerine eşit olana metot kadar kendini çağırıyor
		if (a<=b) {
			System.out.print(a);
			desen2(a+5, b);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen Bir Sayı Giriniz :");
		int num =scan.nextInt(); // metot içerisinde ki a değişkenin yerine geçecek
		int temp = num;          // metot içerisindeki b değişkenin yerine geçecek
		desen(num,temp);
		
	}

}
