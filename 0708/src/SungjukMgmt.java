
public class SungjukMgmt {
	public static void main(String[] args) {
		Student chul = new Student();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n= null;
		do {
			System.out.print("학번: ");
			chul.hakbun= sc.next();
			System.out.print("국어: ");
			chul.kor= sc.nextInt();
			System.out.print("영어: ");
			chul.eng= sc.nextInt();
			System.out.print("수학: ");
			chul.math= sc.nextInt();
			chul.tot = chul.kor+chul.math+chul.eng;
			chul.avr = chul.tot/(double)3;
			
			chul.grade ='\u0000';
			switch((int)(chul.avr/10)) {
				case 10: case 9: chul.grade = 'a'; break;
				case 8: chul.grade = 'b'; break;
				case 7: chul.grade = 'c'; break;
				case 6: chul.grade = 'd'; break;
				default: chul.grade = 'f';
			}
			System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%.1f\t%3c%n",chul.hakbun,chul.kor,chul.eng,chul.math,chul.tot,chul.avr,chul.grade);
			System.out.print("Again(y/n)?");
			y_n = sc.next();
		}while(y_n.equals("Y")||y_n.equals("y"));
		System.out.println("Program is over...");
	}

}
