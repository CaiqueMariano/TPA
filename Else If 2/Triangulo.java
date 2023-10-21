import java.util.Scanner;
public class Triangulo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite o primeiro valor");
		a = in.nextDouble();
		System.out.println("Digite o segundo valor");
		b = in.nextDouble();
		System.out.println("Digite o terceiro valor");
		c = in.nextDouble();
		
		if(a == b && a == c) {
			System.out.println("Triângulo Equilátero");
		}
		else if(a != b && a !=c && b !=a && b !=c && c != a && c!=b) {
			System.out.println("Triângulo Escaleno");
		}
		else{
			System.out.println("Triângulo Isósceles");
		}
		
	}
}
