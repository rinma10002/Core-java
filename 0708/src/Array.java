
public class Array {
	public static void main(String[] args) {
		int []array ;
		array  = new int[4];
		array[0]=5;
		array[1]=6;
		array[2]=7;
		array[3]=8;
		for (int i = 0;i<4;i++) {
			System.out.print("array["+i+"]"+"="+array[i]+"\n");
		}
		
		String[]array2 = {"Hello","Wourld","Good","Java","A"};
		for(int j=0;j<5;j++) {
			System.out.println("array["+j+"] = "+array2[j]);
		}
	}

}
