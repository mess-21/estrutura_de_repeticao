package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_1 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		double val;
		int x = 0;
				
		while(x < 10)
		{
			//Lendo Valor Digitado
			System.out.print("Escreva um valor ("+(++x)+" de 10): ");
			val = leitor.nextDouble();
			
			//Positivo ou Negativo?
			if (val >= 0)
			{
				System.out.println("O valor é Positivo");	
			}
			else
			{
				System.out.println("O valor é Negativo");	
			}	
			
			//-------------------------------
			System.out.println("");	
			//-------------------------------
			
			
		}
		
		
	}

}
