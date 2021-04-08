import java.util.Scanner;

public class Exercicio01 
{
	public static void main(String[] args) 
	{		
		double dPNumero = 0;
		double dSNumero = 0;
		
		Scanner scTeclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		dPNumero = scTeclado.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		dSNumero = scTeclado.nextDouble();
		
		if(dSNumero != 0) 
		{
			System.out.println("Adição: "       +(dPNumero + dSNumero));
			System.out.println("Subtração: "    +(dPNumero - dSNumero));
			System.out.println("Mutiplicação: " +(dPNumero * dSNumero));
			System.out.println("Divisão: "      +(dPNumero / dSNumero));
		}
		else 
		{
			System.out.println("Divisão por zero invalida!");
		}
		scTeclado.close();
	}

}