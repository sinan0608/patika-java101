import java.util.Scanner;
public class KullaniciGirisi {
	public static void main(String[] args) {
		String UserName,Password,kullanici,sifre;
		Scanner bilgi = new Scanner(System.in);
		
		System.out.print("Lütfen Kullanıcı Adınızı Girin:");
			kullanici = bilgi.nextLine();
		System.out.print("Lütfen Şifrenizi Girin:");
			sifre = bilgi.nextLine();
			
			UserName = "patika" ;
			Password = "java101";
			
							
		if(kullanici.equals(UserName) && sifre.equals(Password)) {
			System.out.println("Giriş Başarılı");
		}else if (!kullanici.equals(UserName) && !sifre.equals(Password)) {
			System.out.println("Hatalı Giriş!!! \nŞifrenizi sıfırlamak ister misiniz? \n1-EVET \n2-HAYIR");
			System.out.println("Seçiminiz:");
			
		    int secim;
			secim = bilgi.nextInt();
				if (secim == 1 ) {
			String NewPassword;
				Scanner yeni = new Scanner(System.in);
			    System.out.println("Yeni Şifrenizi Giriniz:");
			    NewPassword = yeni.nextLine();
			    
			    if(Password.equals(NewPassword)) {
			    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz!!! ŞİFRE OLUŞTURULAMADI\nLütfen başka şifre giriniz.");		
	          } else if (!Password.equals(NewPassword)) {;
			    System.out.println("Yeni şifre Oluşturuldu"); 	
			    }
			
				
			}
				
		}
	}
}
		
		
	
	


