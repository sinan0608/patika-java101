import java.util.Scanner;

public class HavaSicakligi {
	public static void main(String[] args) {
		double hava;
		System.out.println("Lütfen Hava Sıcaklığını Girin:");
		Scanner derece = new Scanner(System.in);
		hava = derece.nextDouble(); // double olarak tanımlandığı için hava sıcaklığı küsüratlı olarakta girilebilir.
		
		//else satırı kullanmadan gerçekleştirdim.
		
		if(hava<5) {
			System.out.println("Kayak yapmak için hava çok güzel");			
		} else if (5<=hava) {
			if (hava<15) {
				System.out.println("Sinemaya gitmek için hava çok güzel");
			}else if (15<=hava) {
				if (hava<=25) {
					System.out.println("Piknik yapmak için hava çok güzel");
				}else if (hava>25) {
					System.out.println("Yüzmek için hava çok güzel");
				}
			}
			
		}
						
	}

}
