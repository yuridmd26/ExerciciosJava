import java.util.Scanner;

public class Exercicio05 
{	
	public static void main(String[] args) 
	{		
		Scanner scTeclado = new Scanner(System.in);
		
		System.out.println("Base: ");
		double dBase = scTeclado.nextDouble();
		
		System.out.println("Altura: ");
		double dAltura = scTeclado.nextDouble();
		
		double dArea = (dBase * dAltura) / 2;
		System.out.println("Área: " + dArea);
		
		scTeclado.close();
	}
}