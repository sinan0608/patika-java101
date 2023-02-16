
import java.util.Scanner;

public class UsHesaplama {
		static boolean asal(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return asal(n,i-1);
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen Bir Sayı Girin:");
        int n = scan.nextInt();
        int i = n / 2;
        if (asal(n, i)) {
            System.out.println(n + " asal sayıdır ");
        } else {
            System.out.println(n + " asal sayı değildir");
        }
    }

}
