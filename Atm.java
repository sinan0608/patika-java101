import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName,Password;
		int process,para,right=3,hesap=1000;
		
		while(right>0) {
			System.out.print("Lütfen Kullanıcı Adınız Girin :");
			userName = scan.nextLine();
			System.out.print("Lütfen Şifrenizi Girin :");
			Password = scan.nextLine();
			System.out.println();
		if (userName.equals("patika") && Password.equals("dev123")) {
			System.out.println("Hoşgeldiniz\n");
			
			do {
				System.out.println("Lütfen Menüden Yapmak İstediğiniz İşlemi Seçin :\n"
						+"1-Para Yatırma\n"
						+"2-Para Çekme\n"
						+"3-Bakiye Sorgulama\n"
						+"4-Çıkış\n");
				process=scan.nextInt();
				System.out.println();
				
			switch(process) {
				case 1:
					System.out.print("Lütfen Yatırmak İstediğiniz Tutarı Girin :");
					para = scan.nextInt();
					hesap +=para;
					System.out.println();
					break;
				case 2:
					System.out.print("Lütfen Çekmek İstediğiniz Tutarı Girin :");
					para = scan.nextInt();
					if (para>hesap) {
						System.out.println("Yetersiz Hesap Bakiyesi"+"\n");
						break;
					}
					hesap -=para;
					System.out.println();
					break;
					
				case 3:
					System.out.println("Bakiyeniz :"+hesap +"\n");
					break;
				case 4:
					break;
			
				}
			
			}while (process!=4);
				
			System.out.println("İyi Günler Dileriz");
			break;
				
		}else {
			right--;
			System.out.println("Hatalı Giriş Yaptınız,Lütfen Tekrar Deneyiniz");
			System.out.println("Kalan Deneme Hakkınız :"+right);
			if (right ==0) {
				System.out.println("Hesabınız Bloke Edilmiştir,Bankanızla İletişime Geçiniz!!!");
			}
		}
		
	  }
	}

}
