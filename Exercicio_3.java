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
		

		//Lendo os números digitados
		while(x < 20)
		{
			System.out.print("Escreva um número INTEIRO ("+(++x)+" de 20): ");
			n = leitor.nextInt();	
			sum += n;		
		}
		System.out.println("");
		
		//Calculando média
		media = sum/x;
		
		System.out.println("A soma de todos os números é: "+sum);
		System.out.println("A média aritmética de todos os números é: "+media);
	}

}
