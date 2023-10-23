import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		double a[], s = 0, m;
		final int TAM = 10;
		a  = new double[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i]= in.nextDouble();
		}
		for(i = 0; i <TAM; i++) {
			s = s + a[i];
		}
		m = s/TAM;
		
		System.out.println("A média dos números lidos é igual a \n"+m);


	}

}
