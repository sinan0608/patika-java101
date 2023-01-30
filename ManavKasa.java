import java.util.Scanner;

public class ManavKasa {
	public static void main(String[] args) {
		double Armut,Elma,Domates,Muz,Patlıcan,toplam;
		Scanner manav = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo: ");
		Armut = manav.nextDouble();
		
		System.out.print("Elma Kaç Kilo: ");
		Elma = manav.nextDouble();
		
		System.out.print("Domates Kaç Kilo: ");
		Domates = manav.nextDouble();
		
		System.out.print("Muz Kaç Kilo: ");
		Muz = manav.nextDouble();
		
		System.out.print("Patlıcan Kaç Kilo: ");
		Patlıcan = manav.nextDouble();
		
		toplam = (Armut*2.14)+(Elma*3.67)+(Domates*1.11)+(Muz*0.95)+(Patlıcan*5);
		System.out.printf("Toplam Tutar: %.2f TL " ,toplam );
		
		
		
	}

}
