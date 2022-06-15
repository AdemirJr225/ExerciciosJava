package projetoexercicios;
import java.util.*;
public class Exer16MediaIdade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = 0;
		int idade = 0;
		int total = 0;
		double media;
		
		while(a < 20) {
			System.out.println("Insira 20 idades");
			idade = entrada.nextInt();
			total = total + idade;
			a++;
		}
		media = (double)total/20.00;
		System.out.println("A media das idades é: " + media);
	}



}
