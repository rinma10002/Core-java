
public class VariableDemo {
	int eng = 100; //instance variable
	static int math  = 80; //class variable
	
	
	
	public static void main(String[] args) {
		int kor=100;//local variable
		System.out.printf("수학점수 = %d\n", math);
		System.out.printf("수학점수 = %d\n", Demo.math);
		System.out.printf("국어점수 = %d\n", kor);
		//System.out.printf("영어점수 = %d\n", vd.eng);
		VariableDemo vd = new VariableDemo();
		System.out.printf("영어점수 = %d\n", vd.eng);
		Demo d = new Demo();
		System.out.printf("영어점수 = %d\n", d.eng);
	}
}
class Demo{
	static int math = 70;
	int eng = 50;
}