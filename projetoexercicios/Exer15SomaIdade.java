package projetoexercicios;
import java.util.*;
public class Exer15SomaIdade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = 0;
		int idade = 0;
		int total = 0;
		
		while(a < 20) {
			System.out.println("Insira 20 idades: ");
			idade = entrada.nextInt();
			total = total + idade;
			a++;
		}
		System.out.println("A soma das idades inseridas é: " + total);
	}

}
