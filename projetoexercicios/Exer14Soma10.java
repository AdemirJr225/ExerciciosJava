package projetoexercicios;
import java.util.*;
public class Exer14Soma10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		double soma = 0;
		double total = 0;
		
		while(i < 10) {
			System.out.println("Insira 10 números: ");
			soma = entrada.nextDouble();
			total = total + soma;
			i++;
		}
		System.out.println("A soma dos números é: " + total);
	}

}
