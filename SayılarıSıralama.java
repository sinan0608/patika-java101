import java.util.Scanner;

public class SayılarıSıralama {
	public static void main(String[] args) {
		Scanner deger = new Scanner(System.in);
		int say1,say2,say3;
		System.out.print("1.Sayi Degerini Girin:");
		say1 = deger.nextInt();
		System.out.print("2.Sayi Degerini Girin:");
		say2 = deger.nextInt();
		System.out.print("3.Sayi Degerini Girin:");
		say3 = deger.nextInt();
		
		if ((say1<say2) && (say1<say3)) {
			if (say2<say3) {
				System.out.println("say1<say2<say3");
			}else {
				System.out.println("say1<say3<say2");
			}
		}else if ((say2<say1) && (say2<say3)) {
			if (say1<say3) {
				System.out.println("say2<say1<say3");
			} else {
				System.out.println("say2<say3<say1");
			}
		 }else if ((say3<say1) && (say3<say2)) {
			 if (say1<say2) {
				 System.out.println("say3<say1<say2");
			 }else {
				 System.out.println("say3<say2<say1");
			 }
				
			}
		}
	}

