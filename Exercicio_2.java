package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_2 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int n, x = 1;
			System.out.print("D� um valor INTEIRO a \"n\" : ");
			n = leitor.nextInt();
			System.out.println("");
			
			System.out.println("Todos n�meros inteiros de 1 a "+n);
			
			if (n > 0)//POSITIVO
			{
				//Loopin' 1 a n
				while (x <= n)
				{
					System.out.println(x++);
				}

			}
			else//NEGATIVO ou 0
			{
				//Loopin' n a 1
				while (x >= n)
				{
					System.out.println(x--);
				}
			}	
	
	}

}
