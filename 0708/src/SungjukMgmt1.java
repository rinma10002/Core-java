import java.util.Scanner;

public class SungjukMgmt1 {
	public static void main(String[] args ) {
		Student[] array = new Student[2];
		
		java.util.Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<2 ; i++) {
			array[i] = new Student();
			System.out.print("학번 : "); array[i].hakbun = sc.next();
			System.out.print("국어 : "); array[i].kor = sc.nextInt();
			System.out.print("영어 : "); array[i].eng = sc.nextInt();
			System.out.print("수학 : "); array[i].math = sc.nextInt();
			array[i].tot = array[i].kor+array[i].eng+array[i].math;
			array[i].avr = array[i].tot/3.0;
		}
		for(int i= 0 ; i<2 ; i++) {
			System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f%n",
					array[i].hakbun,array[i].kor,array[i].eng,array[i].math,array[i].tot,array[i].avr);
		}
	}

}
