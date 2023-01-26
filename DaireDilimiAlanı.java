import java.util.Scanner;

public class DaireDilimiAlanı {
	public static void main(String[] args) {
		
		double pi=3.14,r,a,formul;
		
		Scanner deger= new Scanner(System.in);
		System.out.print("Lütfen Yarıçapı Girin:");
		r = deger.nextDouble();
		System.out.print("Lütfen Merkez Açıyı Girin:");
		a =deger.nextDouble();
		
		formul=(pi*(r*r)*a)/360;
		System.out.print("Daire Diliminin Alanı :" +formul);
			
	}

}
