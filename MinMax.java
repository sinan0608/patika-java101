import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {
		Scanner sayi = new Scanner(System.in);
		int a=0, max, min;
		System.out.print("Kaç tane sayı gireceksiniz :");
		a=sayi.nextInt();
		int[] list = new int[a];
		if (a>0) {
			for (int i=0; i<a; i++) {
				System.out.print((i+1)+". sayı :");	
				list[i] = sayi.nextInt();
			}
			
			max = list[0];
			min = list[0];
			for (int i=0 ; i<a ;i++) {
				if(list[i]>max) {
					max =list[i];
				}
				if(list[i]<min) {
					min =list[i];
				}
			}
			
			System.out.println("Min Değer :" + min);
			System.out.println("Max Değer :" + max);
	
		}else {
			System.out.println("Yanlış bir değer girdiniz");
		}
		
	}

}
