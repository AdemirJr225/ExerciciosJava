package projetoexercicios;
import java.util.*;
public class Exer13Fahrenheit {
	public static void main(String[] args) {
		double f;
		double c;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Celsius: ");
		c = entrada.nextDouble();
		
		f = ((9*c+160)/5);
		
		System.out.println("A temperatura em Fahrenheit é: " + f);
		
	}

}
