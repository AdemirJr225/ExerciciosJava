package projetoexercicios;
import java.util.*;
public class Exer9Salarios {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int salario;
		double salario1;
		
		System.out.println("Informe o salario minimo: ");
		salario = entrada.nextInt();
		System.out.println("Informe seu salario: ");
		salario1 = entrada.nextDouble();
		
		 System.out.println("O seu salário equivale a " + (int)salario1/salario + " salarios minimos");
		
		
		
	}

}
