import java.util.Scanner;

public class SungjukMgmt1 {
	public static void main(String[] args) throws java.io.IOException{
		Student[] stdArray = new Student[3];
		java.util.Scanner sc = new java.util.Scanner(new java.io.File("Sungjuk.dat"));
		for(int i = 0 ; i<3 ; i++) {
			//System.out.println(sc.nextLine());
			stdArray[i]= new Student();//비로소 여기서 학생 생성
			String line = sc.nextLine();//스트링 배열로 읽어들임
			//Parsing
			String[]array= line.split("\\s+");
			stdArray[i].hakbun = array[0].trim();
			stdArray[i].name = array[1].trim();
			stdArray[i].kor = Integer.parseInt(array[2].trim());
			stdArray[i].eng = Integer.parseInt(array[3].trim());
			stdArray[i].math = Integer.parseInt(array[4].trim());
		}
		int j = 0;
		while(j<3) {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d%n",stdArray[j].hakbun,stdArray[j].name,stdArray[j].kor,stdArray[j].eng,stdArray[j].math);
			j++;
		}
	}

}
