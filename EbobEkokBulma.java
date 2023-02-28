import java.util.Scanner;

public class EbobEkokBulma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1,n2,a=1,ekok=1,ebob=0;
		System.out.println("Lütfen İki Adet Sayı Giriniz :");
		n1=scan.nextInt();
		n2=scan.nextInt();
		
		while((n1>=a) && (n2>=a)) {
			if(n1%a==0 && n2%a==0) {
				ebob =a;
			}
			a++;
		}
		System.out.println("Girilen Sayıların EBOB Değeri :"+ebob);
		
		while((ekok%n1 !=0) || (ekok%n2 !=0)) {
			ekok++;
		}
		System.out.println("Girilen Sayının EKOK Değeri :"+ekok);
		System.out.println("Formül ile EKOK Değerinin sağlaması :" +(n1*n2)/ebob);
	}
}
