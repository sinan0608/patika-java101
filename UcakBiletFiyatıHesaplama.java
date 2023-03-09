import java.util.Scanner;

public class UcakBiletFiyatıHesaplama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mesafe ,yas , yolculuktipi;
		double normaltutar,yasindirimi=0,yolculukindirimi=0,indirimlitutar=0;
		System.out.print("Lütfen yolculuk mesafesini giriniz :");
		mesafe = scan.nextInt();
		System.out.print("Lütfen yaşınızı giriniz :");
		yas = scan.nextInt();
		System.out.print("Lütfen yolculuk tipinizi seçiniz 1=> Tek Yön , 2=> Gidiş Dönüş :");
		yolculuktipi = scan.nextInt();
		normaltutar= (mesafe * 0.10);
		if(mesafe<=0) {
			System.out.println("Hatalı  Değer Girdiniz.");
		}
			else { 
		if(yas<0) {
			System.out.println("Hatalı değer girdiniz.");
		}
		else  {
		
		if(yas<12) {
			yasindirimi= normaltutar*0.5;
			indirimlitutar= normaltutar-yasindirimi;
		}else if( yas>12 && yas<24 ) {
			yasindirimi= normaltutar*0.10;
			indirimlitutar= normaltutar-yasindirimi;
		}else if( yas>65) {
			yasindirimi= normaltutar*0.30;
			indirimlitutar= normaltutar-yasindirimi;
		}
		
		switch (yolculuktipi) {
			case 1:
				System.out.println("İndirimli Bilet Tutarınız :"+ indirimlitutar + " TL");
				break;
			case 2:
				yolculukindirimi= indirimlitutar*0.20;
				indirimlitutar = (indirimlitutar-yolculukindirimi)*2;
				System.out.println("İndirimli Bilet Tutarınız :"+ indirimlitutar + " TL");
				break;
				default : 
					System.out.println("Hatalı değer girdiniz.");
					break;
			}
		
			
		}
	   }
		
	}

}
