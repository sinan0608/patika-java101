import java.util.Scanner;

public class Kuvvetler {
	public static void main(String[] args) {
		
		// While döngüsü kullarak yapma örneği
		// Bu proje için for döngüsü kullanmak daha uygun
		
		int A,kuvvet4=4,deger1=1,deger2=1,kuvvet5=5;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		A = scan.nextInt();
			
		while(deger1<A) {
			if (deger1==1) {
				System.out.println("Girilen degere kadar 4'ün kuvvetleri=" +deger1);
			}
			deger1 *=kuvvet4;		
			if(deger1<A) {
			System.out.println("Girilen degere kadar 4'ün kuvvetleri=" +deger1);
			}
				
		  } System.out.println();
		  
		while(deger2<A) {
			if (deger2==1) {
				System.out.println("Girilen degere kadar 4'ün kuvvetleri=" +deger2);
			}
			deger2 *=kuvvet5;
			if(deger2<A) {
				System.out.println("Girilen degere kadar 5'in kuvvetleri=" +deger2);
			}
		} 
	}
}
