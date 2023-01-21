import java.util.Scanner;

public class Taksimetre {
	public static void main (String[] args) {
		double km,tutar,acılıs;
		acılıs = 10;
		Scanner mesafe = new Scanner(System.in);
		System.out.print("mesafe kac km :");
		km = mesafe.nextDouble();
		tutar = acılıs+(km * 2.20);
		System.out.println(tutar<20 ? "kisa Mesafe Ucreti 20TL" : tutar +"TL");
		
		// if - else yapısı kullanarak yapılırsa alt taraftaki kod blogu kullanılabilir.
		
	/*	double km,tutar,acılıs;  // if - else yapısı kullanarak yapılırsa 
		acılıs = 10;
		Scanner mesafe = new Scanner(System.in);
		System.out.print("mesafe kac km :");
		km = mesafe.nextDouble();
		tutar = acılıs+(km * 2.20);
		
		 if(tutar<20) {
			System.out.println("Kısa Mesafe Ucreti 20TL");
		}else {
			System.out.println("Ucret=" +tutar+ "TL");
		}  */   
					
	}

}
