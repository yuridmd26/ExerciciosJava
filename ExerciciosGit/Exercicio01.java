import java.util.Scanner;

public class Exercicio01 
{
	public static void main(String[] args) 
	{		
		double dPNumero = 0;
		double dSNumero = 0;
		
		Scanner scTeclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		dPNumero = scTeclado.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		dSNumero = scTeclado.nextDouble();
		
		if(dSNumero != 0) 
		{
			System.out.println("Adi��o: "       +(dPNumero + dSNumero));
			System.out.println("Subtra��o: "    +(dPNumero - dSNumero));
			System.out.println("Mutiplica��o: " +(dPNumero * dSNumero));
			System.out.println("Divis�o: "      +(dPNumero / dSNumero));
		}
		else 
		{
			System.out.println("Divis�o por zero invalida!");
		}
		scTeclado.close();
	}

}