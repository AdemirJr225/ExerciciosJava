package projetoexercicios;
import java.util.*;
public class Exer20Maior8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero;
		int a = 0;
		int soma = 0;
		while(a < 20) {
			System.out.println("Insira um numero: ");
			numero = entrada.nextDouble();
			if(numero > 8) {
				soma++;
			}
			a++;
		}
		System.out.println(soma + " destes 20 numeros inseridos sao maiores que 8");
		
		

	}	
}
