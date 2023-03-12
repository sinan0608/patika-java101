import java.util.Scanner; 
import java.util.Arrays;

public class DizidekiElemanlarıSıralama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Lütfen Dizinin Boyutunu Giriniz : ");
		n = scan.nextInt();
		int[] list = new int[n];
		System.out.println("Lütfen Dizinin Elemanlarını Giriniz :");
		for (int i=0 ; i< list.length; i++ ) {
			System.out.print((i+1)+".Elemanı : ");
			list[i]=scan.nextInt();
		}
		Arrays.sort(list);
		System.out.print("Sıralama : ");
		for (int j:list) {
			System.out.print( j+ " ");
		}
				
	}

}
