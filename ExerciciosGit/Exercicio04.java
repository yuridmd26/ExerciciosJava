import java.util.Scanner;

public class Exercicio04 
{
	public static void main(String[] args) 
	{
		Scanner scTeclado = new Scanner(System.in);
		
		System.out.println("Digite um Valor: ");
		float fValor = scTeclado.nextFloat();
		
		float fAcrescido = (float)(fValor + (fValor * (15.8 / 100)));
		
		System.out.println("Valor atualizado: " + (fAcrescido));
		
		scTeclado.close();
	}
}