
public class HarmonikOrtalama {
	
	public static void main(String[] args) {
		double[] list = new double[5];
		double seri =0.0;
		double ort =0.0;
		for (double i =1 ; i< list.length+1 ; i++) {
			seri +=1/i;
		}
		System.out.println("Harmonik Seri :" +seri);
		ort = (list.length/seri);
		System.out.println("Harmonik Ortalama :" +ort);	
	}

}
