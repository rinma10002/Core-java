
public class SungjukMgmt {
	public static void main(String[] args) {
		int [][]jumsus = {
				{67,89,100},
				{77,99,56},
				{100,99,88}
		};
		for(int i = 0 ; i<jumsus.length ; i++) {
			int tot = 0;
			for(int j = 0 ; j<jumsus[i].length; j++) {
				tot+=jumsus[i][j];
			}
			double avr = tot/3.0;
			char grade = (avr>=90)?'A':
							(avr>=80)?'B':
								(avr>=70)?'C':
									(avr>=60)?'D':'F';
			for(int j=0; j< jumsus[i].length;j++) {
				System.out.printf("%5d\t", jumsus[i][j]);
				
			}System.out.printf("%5d\t%10.1f%5c%n",tot,avr,grade);
		}
	}

}
