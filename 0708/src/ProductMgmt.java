
public class ProductMgmt {
	public static void main(String[] args) {
		Product pencil = new Product();
		pencil.name = "모나미 연필";
		pencil.price = 1000;
//		System.out.printf("name = %s,price = %d원%n", pencil.name,pencil.price);
//		
		Product computer = new Product();
		computer.name = "컴퓨터";
		computer.price = 20_000_00;
//		System.out.printf("name = %s,price = %d원%n", computer.name,computer.price);
		Product[]array = new Product[2];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int i = 0;
		while(i<2) {
			System.out.print("Name : "); array[i].name = sc.next();
			System.out.print("Price : "); array[i].price = sc.nextInt();
			i++;
		}
		for(i =0 ; i<2 ; i++) {
			System.out.printf("name = %s,price = %d%n", array[i].name,array[i].price);
		}
	}

}
