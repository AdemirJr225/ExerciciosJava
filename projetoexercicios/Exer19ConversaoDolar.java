package projetoexercicios;
import java.util.*;
public class Exer19ConversaoDolar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double cotacao;
		double dolar;
		double real;
		System.out.println("Insira o seu dinheiro em dolares: ");
		dolar = entrada.nextDouble();
		System.out.println("Insira o valor da cotacao do dolar: ");
		cotacao = entrada.nextDouble();
		real = dolar*cotacao;
		System.out.println("Você tem " + real + " reais");
		
		

	}

}
