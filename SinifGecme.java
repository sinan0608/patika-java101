import java.util.Scanner;

public class SinifGecme {
	public static void main(String[] args) {
		int mat,turkce,fizik,kimya,muzik,ortalama=0,i=0;
		Scanner ders = new Scanner(System.in);
		
		System.out.print("Matematik notu:");
		mat = ders.nextInt();
		
		System.out.print("turkce notu:");
		turkce = ders.nextInt();
		
		System.out.print("fizik notu:");
		fizik = ders.nextInt();
		
		System.out.print("kimya notu:");
		kimya = ders.nextInt();
		
		System.out.print("muzik notu:");
		muzik = ders.nextInt();

		if (0<=mat && mat<=100) {
			ortalama += mat ;
			i++;  // Ortalamaya katılacak ders sayısını saymak için i=0 olarak bir değişken tanımladım.	
		}
		if (0<=turkce && turkce<=100) {
			ortalama += turkce ;
			i++;		
		}
		if (0<=fizik && fizik<=100) {
			ortalama += fizik ;
			i++;		
		}
		if (0<=kimya && kimya<=100) {
			ortalama += kimya ;
			i++;		
		}
		if (0<=muzik && muzik<=100) {
			ortalama += muzik ;
			i++;		
		}
		
		System.out.println("Ortalama:" +ortalama/i);
		System.out.println(ortalama>=55? "SINIFI GEÇTİNİZ" : "SINIFTA KALDINIZ" );
  }
}

