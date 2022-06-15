package projetoexercicios;
import java.util.*;
public class Exer6AntecessorSucessor {
	public static void main(String[]args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		numero = entrada.nextInt();
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		
		System.out.println("O sucessor deste numero é: "+ sucessor);
		System.out.println("O Antecessor deste numero é: "+ antecessor);
		
	}
}
