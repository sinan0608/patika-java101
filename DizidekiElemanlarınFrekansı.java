
public class DizidekiElemanlarınFrekansı {
	static boolean isFind(int[] arr, int value) {
		for(int i: arr) {
			if(i == value) {
				return true; // value değeri dizi içerisinde varsa true döner.
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] list = {10,20,50,10,20,10,70,30};
		int n=1;
		int startindex=0;
		int[] tekrar = new int[list.length]; //tekrar eden değerleri tutmak için yeni dizi oluşturduk.
		
		for ( int i=0; i< list.length ; i++) {
				n=1;
			for (int j=0; j< list.length; j++) {
				if ( (i!=j) && (list[i]==list[j]) ) {
					n++;
					
					}				
				}
			if ( (n>1) && ( !isFind (tekrar,list[i])) ) {
				tekrar[startindex++]=list[i];
				System.out.println(list[i]+" Sayısı dizi içerisinde "+n+" kere tekrar ediyor." );
				
			}
			
		}
		
	}

}
