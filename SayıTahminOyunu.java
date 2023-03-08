import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahminOyunu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100); // 0-100 arasında rastgele değer üretecek
		
	/*	int number = (int) (Math.random()*100);  // başına (int) yazarak üretilen değerin int olmasını sağladık
	    // Math.random() metodu double bir değer üretir başına int yazmadan int olarak tanımlanamaz normalde 					*/
		
		
		System.out.println(number);
		
		int hak =0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isWrong = false;
		
		
		while(hak<5) {
			System.out.print("Lütfen sayıyı tahmin ediniz :");
			selected = scan.nextInt();
			
			if(selected<0 || selected>100) {
				System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
				if(isWrong) { // isWrong true olmadığı sürece bu if çalışmaz
					hak++;
					System.out.println("Çok fazla hatalı giriş yaptınız! ,Kalan Deneme Hakkınız :" + (5-hak));
					wrong[hak-1] = selected; // -1 yapılmazsa indis sayısının dışına çıkar.
				}else {
					isWrong = true; // isWrong true olur ve bir sonraki denemede yanlışsa yukarıdaki if çalışır.
					System.out.println("Bir daha yanlış girerseniz hakkınızdan düşülecektir.");
				}
				continue;
				
			}
			
			if(number == selected) {
				System.out.println("Tebrikler !!! Tahmin ettiğin sayı :"+ selected);
				isWin =true;
				break;
			}else {
				
				System.out.println("Hatalı bir tahmin yaptınız.");
				if(selected > number) {
					System.out.println("Seçilen sayıdan büyük bir sayı seçtiniz.");
				}else {
					System.out.println("Seçilen sayıdan küçük bir sayı seçtiniz.");
				}
				
				wrong[hak]= selected;
				hak++;
				
				System.out.println("Kalan deneme hakkınız :" + (5-hak));
				
			}
			System.out.println("Hatalı seçtiğiniz sayılar :"+ Arrays.toString(wrong)); // diziyi burada yazdırarak her yanlış denemede sayı ekrana yazılır.
				
		}
		
		if(!isWin) { // doğru tahminde isWin true olur ve burada tersi alındığı için false gözükür ve if çalışmaz.
			System.out.println("Kaybettiniz");
			System.out.println("Tahminleriniz" +Arrays.toString(wrong));
			
		}
		
	
		
	}

}
