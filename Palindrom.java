import java.util.Scanner;

public class Palindrom {
	
     static boolean isPalindrom(int number) { //statik olan yere metot çağırmak için metot statik olarak tanımlanmalı.
		int temp=number, reverseNumber=0,lastNumber;
		while(temp!=0) {
			lastNumber = temp %10;
			reverseNumber = (reverseNumber *10) + lastNumber;
			temp/=10;
		}
		if(number ==reverseNumber)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int number;
		Scanner sayi = new Scanner(System.in);
		number = sayi.nextInt();
		isPalindrom(number); //metot çağrıldı
		System.out.println(isPalindrom(number));//son olarak palindrom sayı ise ekrana true veya false yazar.
		
		if (isPalindrom(number)) {
			System.out.println(number +" => " + "sayı polindrom sayıdır:");
		}else {
			System.out.println(number +" => " + "sayı polindrom sayı değildir.");
		}
	}

}