package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_3 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int n, x, sum, media;
		x = 0;
		sum = 0;
		

		//Lendo os n�meros digitados
		while(x < 20)
		{
			System.out.print("Escreva um n�mero INTEIRO ("+(++x)+" de 20): ");
			n = leitor.nextInt();	
			sum += n;		
		}
		System.out.println("");
		
		//Calculando m�dia
		media = sum/x;
		
		System.out.println("A soma de todos os n�meros �: "+sum);
		System.out.println("A m�dia aritm�tica de todos os n�meros �: "+media);
	}

}
