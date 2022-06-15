package projetoexercicios;
import java.util.*;
public class Exer22Entre100 {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[20];
		int contador = 20;
		
		System.out.println("Digite 20 numeros ");
		
		for(int a = 0; a < numero.length; a++) {
			System.out.printf("Digite um número %d: ", a + 1);
			numero[a] = entrada.nextInt();
		
			if(numero[a] >= 0 && numero[a] >= 100 ) {
				contador--;
			}
		}
		
		System.out.println("A quantidade de números que estão entre 0 e 100 é : " + contador);
	}
	}
	
	
		

