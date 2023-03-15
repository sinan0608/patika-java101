import java.util.Arrays;

public class MatrisTranspozu {
	public static void main(String[] args) {
		int[][] matris = {
						 {10, 15, 20},
						 {25, 30 ,35},					 
		};
		int col = matris.length; // matris'in satır sayısını transpoze'un sutun sayısına eşitledik.
		int row = matris[0].length; // matris'in sütun sayısını transpoze'un satır sayısına eşitledik.
		int[][] transpoze = new int [row][col];
		
		for(int i=0 ; i< matris.length; i++ ) { 
			for(int j=0 ; j< matris[i].length; j++) { // matrisin sütun sayısına kadar gidecek
				transpoze[j][i] = matris[i][j]; // matrisin süyun değerini transpoze nin satır değiri yaptık.
			}
		
		}
		for (int i=0 ; i< transpoze.length; i++) { 
			for (int j=0; j< transpoze[i].length; j++) {
				System.out.print(transpoze[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}
