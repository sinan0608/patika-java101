import java.util.Scanner;

public class NotOrtalamasi {
	public static void main(String[] args) {
		int mat , fizik , kimya , turkce , tarih , muzik ;
		Scanner ders = new Scanner(System.in);
		
		System.out.println("matematik Notunuz:");
		mat = ders.nextInt();
		
		System.out.println("fizik Notunuz:");
		fizik = ders.nextInt();
		
		System.out.println("kimya Notunuz:");
		kimya = ders.nextInt();
		
		System.out.println("turkce Notunuz:");
		turkce = ders.nextInt();
		
		System.out.println("tarih Notunuz:");
		tarih = ders.nextInt();
		
		System.out.println("muzik Notunuz:");
		muzik = ders.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
		double sonuc = toplam/6 ;
		System.out.println("Not Ortalaması:" + sonuc);
		System.out.println(sonuc>=60? "Sınıfı Geçti":"Sınıfta Kaldı");
		
		
		
	}


	}
