import java.util.Arrays;

public class DizideTekrarEdenÇiftSayılar {
	static boolean isFind(int[] arr,int value) {
		for (int i: arr) {
			if ( i==value ) { // eşitlik yakalanırsa return false döner
				return false;
			}		
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int[] list = {2,3,6,3,2,2,4,5,4,7};
		int[] duplicate = new int[list.length];
		int indis =0;
		
		for(int i=0; i< list.length; i++) {
			for( int j=0; j<list.length; j++) {
				if( (i!=j) && (list[i]%2==0) && (list[i]==list[j]) ) {
			//		duplicate[indis++]=list[i];
					if( isFind(duplicate,list[i]) ) {
						duplicate[indis++]=list[i];
					}
				}
			}
		}
		for(int i: duplicate ) {
			if(i !=0) {
			System.out.println(i);	
			}
		}
	}

}
