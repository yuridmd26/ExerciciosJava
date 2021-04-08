import java.util.Scanner;

public class SalarioComBonificacao 
{

	public static void main(String[] args) 
	{
		Scanner sTeclado = new Scanner(System.in);
		
		double dSalario = 0.0;
		
		System.out.println("Informe o salario: ");
		dSalario = sTeclado.nextDouble();
		
		if (dSalario <= 800.00)
			dSalario += dSalario * 0.05;
		else if (dSalario > 800.00 && dSalario < 1300.00)
			dSalario += dSalario * 0.12;
		
		if (dSalario <= 900.00)
			dSalario += 150.00;
		else
			dSalario += 100.00;
		
		System.out.println("Seu salário final é de: " + dSalario);
	}

}
