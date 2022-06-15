package projetoexercicios;
import java.util.*;
public class Exer24SomaSequencia {

		public static void main(String[] args) {
						
				Scanner entrada = new Scanner(System.in);
				
				int numero = 0;
				int soma = 0;
				
				while(numero >= 0){
					System.out.println("Digite um número inteiro: ");
					numero = entrada.nextInt();
					
					soma = numero + soma;
					System.out.println("Total: " + soma);
				}if(numero < 0) {
					System.out.println("Esse número é inválido. Operacao finalizada");
			}
		}
	}