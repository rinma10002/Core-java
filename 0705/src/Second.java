
public class Second {
	public static void main(String[] args) {
		System.out.print("값(초단위)을 입력하시오:");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int x = a/3600;
		int y = (a-x*3600)/60;
		int z = a-3600*x-60*y;
		System.out.print(a+"초는 "+x+"시간 "+y+"분 "+z+"초 입니다.");
	}

}
