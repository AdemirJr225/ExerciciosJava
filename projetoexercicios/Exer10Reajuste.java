package projetoexercicios;
import java.util.*;
public class Exer10Reajuste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double saldo;
		double reajuste;
		
		System.out.println("Informe o seu saldo: ");
		saldo = entrada.nextDouble();
		
		reajuste = saldo - (saldo*(1.5/100));
		
		System.out.println("Seu saldo após o reajuste sera de " + reajuste);

	}

}
