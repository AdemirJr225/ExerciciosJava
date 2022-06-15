package projetoexercicios;
import java.util.*;
public class Exer1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int prato;
		int sobremesa;
		int bebida;
		int calorias = 0;
		
		System.out.println("Escolha um prato (1 - Vegetariano, 2 - Peixe, 3 - Frango e 4 - Carne): ");
		prato = entrada.nextInt();
		
		switch(prato) {
		case 1:
			calorias = calorias + 180;
			System.out.println("Prato vegetariano, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 2:
			calorias = calorias + 230;
			System.out.println("Prato de peixe, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 3:
			calorias = calorias + 250;
			System.out.println("Prato de frango, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 4:
			calorias = calorias + 350;
			System.out.println("Prato de carne, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		}
		
		System.out.println("Escolha uma sobremesa (1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet e 4 - Mouse de chocolate): ");
		sobremesa = entrada.nextInt();
		
		switch(sobremesa) {
		case 1:
			calorias = calorias + 75;
			System.out.println("Abacaxi, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 2:
			calorias = calorias + 110;
			System.out.println("Sorvete diet, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 3:
			calorias = calorias + 170;
			System.out.println("Mouse diet, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 4:
			calorias = calorias + 200;
			System.out.println("Mouse de chocolate, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		}
		
		System.out.println("Escolha uma bebida (1 - Chá, 2 - Suco de laranja, 3 - Suco de melão e 4 - Refrigerante diet): ");
		bebida = entrada.nextInt();
		
		switch(bebida) {
		case 1:
			calorias = calorias + 20;
			System.out.println("Chá, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 2:
			calorias = calorias + 70;
			System.out.println("Suco de laranja, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 3:
			calorias = calorias + 100;
			System.out.println("Suco de melão, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		case 4:
			calorias = calorias + 65;
			System.out.println("Refrigerante diet, você tem essa quantidade de calorias no seu prato: " + calorias);
		break;
		}
		
		System.out.println("A quantidade total de calorias é: " + calorias);

}
}
