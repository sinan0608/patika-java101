import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayıyaYakınlık {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {50,-48,25,16,19,37,211,-77,-23};
		System.out.print("Lütfen bir sayı giriniz :");
        int sayi = scan.nextInt();
        
        Arrays.sort(array); // dizi küçükten büyüğe sıralandı

        int enyakinkucuk = 0;
        int enyakinbuyuk = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            
            if (array[i] < sayi){ // Dizinin en büyüğünden aşağı doğru inerken ilk küçük sayıda döngüden çıkar
                enyakinkucuk = array[i];
                break;
            }
        }

        for (int i = 0; i < array.length; i++){

            if (array[i] > sayi){ // Dizinin en küçükğünden yukarı doğru çıkarken ilk büyük sayıda döngüden çıkar
                enyakinbuyuk = array[i];
                break;
            }
        }

        System.out.println("Girilen sayıya en yakın küçük değer : " + enyakinkucuk);
        System.out.println("Girilen sayıya en yakın büyük değer : " + enyakinbuyuk);
	
	}

}
