import java.util.Scanner;

public class ArtıkYıl {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen Bir Yıl Giriniz :");
		int sayi= scan.nextInt();
		
		if (sayi % 4 ==0 || sayi % 400 == 0 ) {
			System.out.println(sayi+" bir artık yıldır !");
		}else
			System.out.println(sayi+" bir artık yıl değildir !");
	}

}
