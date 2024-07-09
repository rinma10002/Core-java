
public class HelloWorld8 {
	public static void main(String[] args) {
		print();//다른 클래스의 맴버 메소드는 클래스를 생성하고 그 주소로 접근한다.
		new Car().print();
	}

}
class Car{
	void print() {
	System.out.println("Hello World");
	}
}

