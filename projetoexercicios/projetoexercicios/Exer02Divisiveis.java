package projetoexercicios;
import java.util.*;
public class Exer02Divisiveis {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Insira um numero: ");
		numero = entrada.nextInt();
		int i = 0;
		boolean divisivel = false;
		
		while(i <= 10) {
			i++;
			if(numero % i == 0 && i == 2 && numero != 0) {
				System.out.println(numero + " e divisivel por 2");
				divisivel = true;
			}else if(numero % i == 0 && i == 5 && numero != 0) {
				System.out.println(numero + " e divisivel por 5");
				divisivel = true;
			}else if(numero % i == 0 && i == 10 && numero != 0) {
				System.out.println(numero + " e divisivel por 10");
				divisivel = true;
			}
		}
		if(divisivel == false) {
			System.out.println("Nao e divisivel por nenhum numero");
		}
		
		

	}


}
