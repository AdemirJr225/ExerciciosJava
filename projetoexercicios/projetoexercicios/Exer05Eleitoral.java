package projetoexercicios;
import java.util.*;
public class Exer05Eleitoral {
	
	public static void main(String args[]) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		idade = entrada.nextInt();
		
		if(idade < 16) {
			System.out.println("Nao pode votar");
		}else if(idade >= 18 && idade < 65) {
			System.out.println("Voto obrigatorio");
		}else {
			System.out.println("Voto facultativo");
		}
	}

}
