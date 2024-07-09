
public class HelloWorld7 {
	public static void main(String[] args) {
		Employee.print();//다른 클래스의 스태틱 메소드는 클래스 이름으로 접근한다.
		
	}

}
class Employee{
	static void print() {
		System.out.println("Hello World");
	}
}

