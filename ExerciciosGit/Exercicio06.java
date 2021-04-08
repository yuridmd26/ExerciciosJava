import java.util.Scanner;

public class Exercicio06 
{
	public static void main(String[] args) 
	{
		final double VALOR_HORA       = 32.00;
		final double VALOR_DEPENDENTE = 40.00;
		
		Scanner scTeclado = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = scTeclado.nextLine();
		
		System.out.println("Número de horas trabalhadas: ");
		int iNumHoras = scTeclado.nextInt();
		
		System.out.println("Número de dependências: ");
		int iDependencias = scTeclado.nextInt();
		
		double dSalarioBruto = ((iNumHoras * VALOR_HORA) + (iDependencias * VALOR_DEPENDENTE));
		double dValorInss    = dSalarioBruto * (8.5 / 100);
		double dValorIR      = dSalarioBruto * (5.0 / 100);
		double dValorLiquido = (dSalarioBruto - dValorInss - dValorIR);
		
		System.out.println("=====================================");
		System.out.println("=          Ficha de dados           =");
		System.out.println("=====================================");
		System.out.println("= Nome: " + nome                            );
		System.out.println("= Numero de horas trabalhadas: " + iNumHoras);
		System.out.println("= Numero de dependencias: " + iDependencias );
		System.out.println("=====================================");
		System.out.println("= Salario Bruto: "   + dSalarioBruto  );
		System.out.println("= INSS: "            + dValorInss     );
		System.out.println("= IR: "              + dValorIR       );
		System.out.println("= Salario Liquido: " + dValorLiquido  );
		System.out.println("=====================================");
		
		scTeclado.close();
	}
}