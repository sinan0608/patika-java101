import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,temp= 1,result=0;
		System.out.print("Kaç Elemanlı Bir Fibonacci Serisi Olsun :");
		n = scan.nextInt();
		System.out.print(result+" "); // 0 her seride olacak 
		System.out.print(temp+" ");
		for (int i=1; i<=n ; i++) { // her dönüşte ekrana 2 kez değer yazacak
							       //  her yazdığı değer için i'yi 1 arttırıyoruz.
			result +=temp;
			System.out.print(result+" ");
			i++; 
				for (int k=1; temp<=result; k++) {
					temp +=result;
					i++; 
					System.out.print(temp+" ");
				}
		
			
		}
	}

}
