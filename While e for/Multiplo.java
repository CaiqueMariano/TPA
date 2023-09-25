
public class Multiplo {

	public static void main(String[] args) {
		int a, i =1;
		
		for(; i <101; i++) {
			a = i%10;
			
			if(a == 0) {
				
				System.out.println(i+"-Múltiplo de 10");
			}else {
				System.out.println(i);
			}
		}

	}

}
