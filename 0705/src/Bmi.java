
public class Bmi {
	public static void main(String[] args) {
		System.out.print("이름, 신장(cm), 몸무게(kg)을 입력해 주세요.");
		java.util.Scanner n = new java.util.Scanner(System.in);
		java.util.Scanner h = new java.util.Scanner(System.in);
		java.util.Scanner w = new java.util.Scanner(System.in);
		String name = n.nextLine();
		double cm = h.nextDouble();
		double kg = w.nextDouble();
		double bmi = cm*0.01/(kg*kg);
//		String stage;
//		if(bmi>35) {
//			String stage = "3단계비만";
//		}else if(30<=bmi<=34.9) {
//			String stage = "2단계비만";
//		}else if(25<=bmi<=29.9) {
//			String stage = "1단계비만";
//		}else if(23<=bmi<=24.9) {
//			String stage = "비만전단계";
//		}else if(18.5<=bmi<=22.9) {
//			String stage = "정상";
//		}else {
//			String stage = "저체중";
//		}	
//		System.out.print(name+"님의 BMI지수는 "+bmi+"이고 "+stage+"입니다.");
		System.out.print(name+"님의 BMI지수는 "+bmi+"이고 입니다.");
	}

}
