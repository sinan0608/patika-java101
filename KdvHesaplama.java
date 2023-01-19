import java.util.Scanner;

public class KdvHesaplama {
	public static void main(String[] args) {
		double ürün ;
		Scanner fiyat = new Scanner(System.in);
		
		System.out.println("ürün fiyatı:");
		ürün = fiyat.nextDouble();	
		System.out.println("ürün fiyatı="+ürün);
		
		System.out.println("ürünün %18 KDV tutarı="+ürün*0.18); // +%18 kdv hesaplama
		System.out.println("ürünün %8 KDV tutarı="+ürün*0.08);
		
	    System.out.print(ürün<=1000? "%18 KDV'li fiyat=":"%8 KDV'li fiyat=");
		System.out.println(ürün<=1000? ürün+ ürün*0.18 : ürün+ ürün*0.08); // 1000 TL altı %18 KDV, 1000 TL üstü %8 KDV
		
		
	}

}
