package projetoexercicios;
import java.util.*;
public class Exer17Maioridade {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int soma = 0;
	int idade = 0;
	int a = 0;
	
	while(a < 20) {
		System.out.println("Insira uma idade: ");
		idade = entrada.nextInt();
		if(idade >= 18) {
			soma++;
		}
		a++;
	}
	System.out.println("A quantidade de pessoas maiores de idade são : " + soma);
	

}

}
