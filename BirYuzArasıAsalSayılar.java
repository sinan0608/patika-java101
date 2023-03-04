
public class BirYuzArasıAsalSayılar {
	public static void main(String[] args) {
		
		for (int a=2 ; a<=100 ; a++) {
			int t=0;
		for (int i=2; i<=100 ; i++) {		
			if (i==a) {
				continue;
			}else if (a%i==0) {
				t+=i;
			}	
		}
			if (t==0) {
			System.out.println(a);	
		}
		
		}
		
	}

}
