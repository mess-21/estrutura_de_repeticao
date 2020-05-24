package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio_5 
{

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int x = 0,F_salario_1000;
		double altura, salario, soma_salario, maior_altura, menor_altura, media;
		String sexo;
		soma_salario = 0;
		maior_altura = 0;
		menor_altura = 0;
		F_salario_1000 = 0;
		
		while (x < 3)
		{
		System.out.println("=====Funcionário "+(++x)+"=====");
		
		System.out.print("Digite o sexo do(a) funcionário(a) (M para masculino / F para feminino): ");
		sexo = leitor.next();
		//checando o valor de M e F
		if (!sexo.equals("M") && !sexo.equals("F"))
		{
		--x;
			while (!sexo.equals("M") && !sexo.equals("F"))
			{
			System.out.println("ERRO");
			System.out.println("Ensira somente \"F\" ou \"M\" para os sexo.");
			System.out.print("Digite o sexo do(a) funcionário(a) (M para masculino / F para feminino): ");
			sexo = leitor.next();
			}		
		++x;
		}
		System.out.print("Digite a altura do(a) funcionário(a) em centímetros: ");
		altura = leitor.nextDouble();	
		System.out.print("Digite o salário do(a) funcionário(a): ");
		salario = leitor.nextDouble();
		soma_salario += salario;
		
		//checando altura
		if(altura > maior_altura)
		{
			maior_altura = altura;
		}
		else if (altura < menor_altura)
		{
			menor_altura = altura;
		}
		
		if(menor_altura == 0)
		{
			menor_altura = altura;	
		}
		
		
		//Sálario menor ou igual a 1000 
		if (sexo.equals("F"))
		{
			if(salario <= 1000)
			{
			F_salario_1000++; 
			}
		}
		
		
		System.out.println("");
		}
		
		media = soma_salario/x;
		
		System.out.println("A media salarial do grupo de funcionários é aproximadamente: R$"+( Math.floor(media)) );
		System.out.println("A MAIOR altura do grupo de funcionários é: "+maior_altura+"cm");
		System.out.println("A MENOR altura do grupo de funcionários é: "+menor_altura+"cm");
		System.out.println("A quantidade de mulheres com o salário até R$1000,00 é: "+F_salario_1000);
		
	}

}
