import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		double a,b; //double veri tipinde 2 adet değişken tanımladık
		Scanner sayı = new Scanner(System.in);
		System.out.println("lütfen sayı değerlerini giriniz");
		System.out.print("a=");
		a= sayı.nextDouble();
		System.out.print("b=");
		b=sayı.nextDouble();
		
		Scanner operator = new Scanner(System.in); // switch case işlemlerini atamak için
		int islem;
		System.out.print("kaç numaralı işlem yapılsın:");
		islem= operator.nextInt();
		switch(islem) {
		case 1:
			System.out.println("toplama islemi sonucu=" +(a+b));
			break;
		case 2:
			System.out.println("çıkarma islemi sonucu=" +(a-b));
			break;
		case 3:
			System.out.println("çarpma islemi sonucu=" +(a*b));
			break;
		case 4:
			System.out.println("bölme islemi sonucu=" +(a/b));
			break;
		default:
			System.out.println("tanımlı olmayan bir işlem girdiniz");
			break;
					
		}
		
	}
	

}
