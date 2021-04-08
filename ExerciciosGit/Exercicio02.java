import java.util.Scanner;

public class Exercicio02 
{	
	public static void main(String[] args) 
	{	
		double dPrimeiroNumero = 0;
		double dSegundoNumero  = 0;
		double dTerceiroNumero = 0;
		
		Scanner scTeclado = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		dPrimeiroNumero = scTeclado.nextDouble();
		
		System.out.println("Digite o número 2: ");
		dSegundoNumero = scTeclado.nextDouble();
		
		System.out.println("Digite o número 3: ");
		dTerceiroNumero = scTeclado.nextDouble();
		
		System.out.println("Operaçăo 1: " + (dPrimeiroNumero + dSegundoNumero ));
		System.out.println("Operaçăo 2: " + (dSegundoNumero  - dPrimeiroNumero));
		System.out.println("Operaçăo 3: " + (dTerceiroNumero * dPrimeiroNumero));
		System.out.println("Operaçăo 4: " + (dTerceiroNumero + dSegundoNumero ));
		System.out.println("Operaçăo 5: " + (dTerceiroNumero - dSegundoNumero ));
		System.out.println("Operaçăo 6: " + (dPrimeiroNumero + dSegundoNumero + dTerceiroNumero));
		
		scTeclado.close();
	}
}