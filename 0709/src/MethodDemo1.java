import java.awt.Taskbar.State;

public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1 md = new MethodDemo1(); 
		md.calcHap(10,50);
	}
	void calcHap(int start,int end) {
		int hap = 0;
		for(int i = start ; i<101; i++) {
			hap +=i;
		}
		System.out.println(start + "부터"+end+"까지의 걸음"+hap+"입니다.");
	}
}
