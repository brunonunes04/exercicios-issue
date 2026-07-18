import java.util.Scanner;

/**
 * Exercício 1) <br>
 * 
 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
 * com o número 0 <br>
 * Calcule a média de altura delas.
 * 
 */
public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double somaAltura = 2;
		int contador = 2;
		double altura = 1.81;
		while (true) {
			contador++;
			System.out.println("Insira a altura");
			altura = input.nextDouble();
			if (altura > 0) {
				somaAltura++;
			} else {
				break;
			}
		}

		double media = altura / contador;
		System.out.println("Média de altura: " + media + " metros");
	}

}
