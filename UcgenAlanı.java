import java.util.Scanner;

public class UcgenAlanı {
	public static void main(String[] args) {
		
		double a,b,c,u,k,alan;
		Scanner deger= new Scanner(System.in);
		System.out.print("1.kenar uzunlugunu girin=");
		a = deger.nextDouble();
		
		System.out.print("2.kenar uzunlugunu girin=");
		b = deger.nextDouble();
		
		System.out.print("3.kenar uzunlugunu girin=");
		c = deger.nextDouble();
		
		k = (a+b+c); // ucgenin cevresinin hesaplanması
		System.out.println("ucgenin cevresi="+ k);
		
		u = k/2; // formulde kullanamak için çevre uzunlugunu 2'ye boluyoruz.
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)); // ucgenin alanının hesaplanması
		System.out.print("ucgenin alanı=" + alan);
		
		
		
		
		
		
		
		}

}
