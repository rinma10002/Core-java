
public class ArrayDemo4 {
	public static void main(String[] args) {
		//배열릐 주소 복사
//		int [] original = {3,4,5};
//		int[] target = original;
//		target[0]= 100;
//		==============================
		int [] original = {3,4,5};
		int[] target = new int[10];
		System.arraycopy(original, 0, target, 0, 3);// 오리지널의 0번쨰부터 3개를 복사해서 타겟에 0번쨰부터 넣어
//		=================================
	}

}
