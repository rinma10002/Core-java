
public class While {
	public static void main(String[] args) {
		
		int i =1;
		while(i<=9){
			int dan=1;
			while(dan<=9) {
				System.out.print(i+"X"+dan+"="+i*dan);
				System.out.println();
				dan++;
			}
			System.out.println();
			i++;
		}
		
	}

}
