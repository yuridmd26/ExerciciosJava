import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio03 
{	
	public static void main(String[] args) 
	{		
		Scanner scTeclado = new Scanner(System.in);
		
		LocalDateTime DataAtual = LocalDateTime.now();
		
		System.out.println("Ano de Nascimento: ");
		int dataNascimento = scTeclado.nextInt();
		
		int idadeAtual = (DataAtual.getYear() - dataNascimento);
		
		System.out.println("Idade: " + idadeAtual);
		
		scTeclado.close();
	}
}