public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
		
	}
		
	void run() {
		if(isCheck()) {
			if( whoİsFirst() ) { // true dönerse f1 sporcusu başlar
				System.out.println("A Başladı");
			while(this.f1.health > 0 && this.f2.health > 0 ) {
				System.out.println("===== YENİ ROUND =====");
				this.f2.health = this.f1.hit(f2);
				System.out.println(this.f2.health);
				if(isWin()) {
					break;
				}	
				this.f1.health = this.f2.hit(this.f1);
				if (isWin()) {
					break;
				}
				System.out.println(this.f1.name+" Sağlık :" +this.f1.health);
				System.out.println(this.f2.name+" Sağlık :" +this.f2.health);
			}
			}
			
			if( !whoİsFirst() ) { // false dönerse f2 sporcusu başlar 
				System.out.println("B Başladı");
				while(this.f1.health > 0 && this.f2.health > 0 ) {
					System.out.println("===== YENİ ROUND =====");
					this.f1.health = this.f2.hit(f1);
					System.out.println(this.f2.health);
					if(isWin()) {
						break;
					}	
					this.f1.health = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name+" Sağlık :" +this.f1.health);
					System.out.println(this.f2.name+" Sağlık :" +this.f2.health);
				
			}
			}
			
		}
			else 
			System.out.println("Sporcuların sikletleri uymuyor.");
		}
	
	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight ) && 
				(this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
		
	}
	
	boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " Kazandı");
			return true;
		}if (this.f2.health == 0 ) {
			System.out.println(this.f1.name + " Kazandı");
		return true;
		}
		return false;
	}
	boolean whoİsFirst() {
		double randomNumber = Math.random()*100;
		if (randomNumber >=0 && randomNumber <=50)
			return true;
		else
			return false;
		
	}
}
