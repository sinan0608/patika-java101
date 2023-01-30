import java.util.Scanner;

public class VucutKitle {
	public static void main (String[] args) {
		double boy,kilo,indeks;
		Scanner kitle = new Scanner(System.in);
		System.out.print("Lütfen Boyunuzu Metre Cinsinde Olacak Şekilde Giriniz: ");
		boy = kitle.nextDouble();
		System.out.print("Lütfen Kilonuzu Giriniz: ");
		kilo = kitle.nextDouble();
		
		indeks = kilo/(boy*boy);
		System.out.print("Vücut Kitle İndeksiniz: " +indeks);
	
	}

}
