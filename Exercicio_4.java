package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_4 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		long n, x, maior;
		x = 0;
		maior = 0;
		
		while(x < 15)
		{
			//Lendo os n�mero digitado
			System.out.print("Escreva outro n�mero INTEIRO ("+(++x)+" de 15): ");
			n = leitor.nextLong();
			//Escolhendo maior n�mero
			if (n > maior)
			{
				maior = n;
			}
		}
		System.out.println("");
		
		System.out.println("O maior n�mero digitado �: "+maior);	
	}

}
