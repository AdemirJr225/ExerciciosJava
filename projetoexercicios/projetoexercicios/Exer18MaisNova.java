package projetoexercicios;
import java.util.*;
public class Exer18MaisNova {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menor = 0;
		int idade = 0;
		String nome = null;
		int a = 0;
		
		while(a < 10) {
			System.out.println("Insira uma idade: ");
			idade = entrada.nextInt();
			System.out.println("Insira o nome: ");
			nome = entrada.next();
			if(a == 0) {
				menor = idade;
			}else {
				if(idade < menor) {
					menor = idade ;
				}
			}
			a++;
			
		}
		System.out.println("A pessoa mais nova tem essa idade: " + menor+ "e seu nome é: "+nome);
		

	}

}
