
public class Switch {
	public static void main(String[] args) {
		int i = (int)(10*Math.random()+1);
		System.out.println(i);
		switch(i) {
		case 1: System.out.print("Bananas"); break;
		case 2: System.out.print("Oranges"); break;
		case 3: System.out.print("Peach");
		case 4: System.out.print("Apples");
		case 5: System.out.print("plums"); break;
		case 6: System.out.print("Pineapples"); break;
		case 7: System.out.print(""); break;
		default : System.out.print("Nuts"); 
		}
	}

}
