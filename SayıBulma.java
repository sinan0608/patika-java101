import java.util.Scanner;
public class SayıBulma {
	public static void main(String[] args) {
		int i,k=0,bolum=0,toplam=0;
		Scanner sayı = new Scanner(System.in);
		
		System.out.println("Lütfen Bir Sayı Giriniz:");
		i = sayı.nextInt();
		while(k<i) { 				// i yerine 13 girersek
			if (k%3==0 && k%4==0){ // 0 ve 12 sayılarında yani 2 sayıda  3 ve 4 bölündüğü için toplam sayı 2 ye bölünür.
				toplam +=k;	
				bolum++;	
			}
			k++;	
		}
		
		System.out.println("ortalama=" +toplam/bolum);
	}

}
