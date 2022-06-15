package projetoexercicios;
import java.util.*;
public class Exer21Parcelas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor;
		double parcela;
		System.out.println("Insira o valor da compra: ");
		valor = entrada.nextDouble();
		
		parcela = valor/5.0;
		
		System.out.println("O valor de cada parcela em 5 vezes será: " + parcela);
		
		
		
		

	}

}
