
public class ArrayDemo5 {
	public static void main(String[] args) {
		double[] array = {3.14,89.5,182.5,69.2};
//		for (int i = 0 ; i<array.length;i++) {
//			System.out.printf("%2f%n",array[i]);
//		}
//		==========================================
		//Enhanced for
		for (double d : array) {
			System.out.println(d);
			
		}
		
	}	

}
