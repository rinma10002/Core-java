
public class HelloWorld4 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.str);//다른 클래스에있는 맴버 변수는 속해있는 클래스를 생성하고 그주소로 접근한다.
				
	}

}
class Test{
	 String str = "Hello World";
}
