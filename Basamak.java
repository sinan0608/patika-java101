import java.util.Scanner;

public class Basamak {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,toplam=0,bas=1,last;
		System.out.print("Lütfen Bir Sayı Giriniz :");
		a = scan.nextInt();
		
		while ( bas > 0) {
		last = a%10;
		a /=10;
		bas=a;
		toplam +=last;
		System.out.print(last+ " + " );
		}
		System.out.print(+0+"\n");
		System.out.println("Girilen Sayının Basamakları Toplamı ="+toplam);
			
	}

}
