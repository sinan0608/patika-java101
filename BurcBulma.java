import java.util.Scanner;

public class BurcBulma {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ay,gün;
		System.out.println("Doğduğunuz ay :");
		ay = scan.nextInt();
		System.out.println("Doğduğunuz gün :");
		gün = scan.nextInt();
		
		if (ay==1) {
			if (1<=gün  && gün<=21) {
				System.out.println("oğlak burcu");
			}else if (31>=gün && gün>=22) {
				System.out.println("Kova burcu");
			}
		}else if (ay==2) {
			if (gün>=1 && gün<=19) {
				System.out.println("Kova Burcu");
			}else if (1<=gün && gün<28) {
				System.out.println("Balık Burcu");
			}
		}else if (ay==3) {
			if (gün>=1 && gün<=20) {
				System.out.println("Balık Burcu");
			}else if (gün<=31 && gün>=21) {
				System.out.println("Koç Burcu");
			}
		}else if (ay==4) {
			if (gün>=1 && gün<=20) {
				System.out.println("Koç Burcu");
			}else if (gün>=21 && gün<=30) {
				System.out.println("Boğa Burcu");
			}
		}else if (ay==5) {
			if (gün>=1 && gün <=21) {
				System.out.println("Boğa Burcu");
			}else if (gün>=22 && gün <=31) {
				System.out.println("İkizler Burcu");
			}
		}else if (ay==6) {
			if (gün>=1 && gün<=22) {
				System.out.println("İkizler");
			}else if (gün>=23 && gün<=30) {
				System.out.println("Yengeç Burcu");
			}
		}else if (ay==7) {
			if (gün>=1 && gün<=22) {
				System.out.println("Yengeç Burcu");
			}else if (gün>=23 && gün<=31) {
				System.out.println("Aslan Burcu");
			}
		}else if (ay==8) {
			if (gün>=1 && gün <=22) {
				System.out.println("Aslan Burcu");
			}else if (gün>=23 && gün <=31) {
				System.out.println("Başak Burcu");
			}
		}else if (ay==9) {
			if (gün>=1 && gün <=22) {
				System.out.println("Başak Burcu");
			}else if (gün<=23 && gün<=30) {
				System.out.println("Terazi Burcu");
			}
		}else if (ay==10) {
			if (gün>=1 && gün<=22) {
				System.out.println("Terazi Burcu");
			}else if (gün>=23 && gün<=31) {
				System.out.println("Akrep Burcu");
			}
		}else if (ay==11) {
			if (gün>=1 && gün<=21) {
				System.out.println("Akrep Burcu");
			}else if (gün>=22 && gün<=30) {
				System.out.println("Yay Burcu");
			}
		}else if (ay==12) {
			if (gün>=1 && gün<=21) {
				System.out.println("Yay Burcu");
			}else if (gün>=22 && gün<=31) {
				System.out.println("Oğlak Burcu");
			}
		}
		
	}

}
