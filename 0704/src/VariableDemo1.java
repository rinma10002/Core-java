import java.util.Scanner;

public class VariableDemo1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("국어점수 : ");
		String kor = sc.nextLine();
		System.out.print("수학점수 : ");
		String math = sc.nextLine();
		System.out.print(kor + math);
	}
}
