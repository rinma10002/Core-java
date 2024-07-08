
public class ConditionDemo {
	public static void main(String[] args) {
		System.out.print("Favorite Season(spring, summer, fall, winter) : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String season = sc.nextLine();
//		if(season.equals("spring")) {
//			System.out.println("봄");
//		}else if(season.equals("summer")) {
//			System.out.println("여름");
//		}else if(season.compareTo("fall")==0) {
//			System.out.println("가을");
//		}else{
//			System.out.println("겨울");
//		}
		swich(season){
			case "spring":System.out.println("봄"); break;
			case "summer":System.out.println("여름"); break;
			case "fall":System.out.println("가을"); break;
			default : System.out.println("겨울"); 
		}
	}

}
