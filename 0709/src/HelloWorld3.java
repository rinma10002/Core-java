
public class HelloWorld3 {
	public static void main(String[] args) {
		System.out.println(Demo.str);//타 클래스에있는 스태틱 변수는 속해있는 클래스 이름으로 접근한다.
		
	}

}
class Demo{
	static String str = "Hello World";
}
