
public class DoDemo {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n= null;
		do {
			System.out.print("몇 펙토리얼? : ");
			int su = sc.nextInt();
			int answer = 1;
			for (int i=su ; i>0 ; i--) {
				answer*=i;
			}
			System.out.println(su + "!=" + answer);
			System.out.print("Again(y/n)?");
			y_n = sc.next();
		}while(y_n.equals("Y")||y_n.equals("Y"));
	}

}
