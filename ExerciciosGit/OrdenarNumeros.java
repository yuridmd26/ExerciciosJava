import java.util.Scanner;

public class OrdenarNumeros 
{

	public static void main(String[] args) 
	{
		Scanner sTeclado = new Scanner(System.in);
		
		double dValorA = 0;
		double dValorB = 0;
		double dValorC = 0;
		
		System.out.println("Informe o valor A: ");
		dValorA = sTeclado.nextDouble();
		System.out.println("Informe o valor B: ");
		dValorB = sTeclado.nextDouble();
		System.out.println("Informe o valor C: ");
		dValorC = sTeclado.nextDouble();
		
		int iNumero = 0;

		do
		{
			System.out.println("Informe a opção (1, 2 ou 3)");
			iNumero = sTeclado.nextInt();
		
			switch(iNumero)
			{
		    	case 2:
		    	{
		    		if (dValorA > dValorB && dValorA > dValorC)
		    		{
		    			if (dValorB > dValorC)
		    				System.out.println("1- " + dValorA + " 2- " + dValorB + " 3- " + dValorC);
		    			else
		    				System.out.println("1- " + dValorA + " 2- " + dValorC + " 3- " + dValorB);
		    		}
		    		else
		    		{
		    			if (dValorB > dValorA && dValorB > dValorC)
		    			{
		    				if (dValorA > dValorC)
		    					System.out.println("1- " + dValorB + " 2- " + dValorA + " 3- " + dValorC);
		    				else
		    					System.out.println("1- " + dValorB + " 2- " + dValorC + " 3- " + dValorA);
		    			}
		    			else
		    			{
		    				if (dValorC > dValorA && dValorC > dValorB)
		    				{
		    					if (dValorA > dValorB)
		    						System.out.println("1- " + dValorC + " 2- " + dValorA + " 3- " + dValorB);
		    					else
		    						System.out.println("1- " + dValorC + " 2- " + dValorB + " 3- " + dValorA);
		    				}
		    			}
		    		}
		    	}
		    	break;
		    
		    	case 1:
		    	{
		    		if (dValorA > dValorB && dValorA > dValorC)
		    		{
		    			if (dValorB > dValorC)
		    				System.out.println("1- " + dValorC + " 2- " + dValorB + " 3- " + dValorA);
		    			else
		    				System.out.println("1- " + dValorB + " 2- " + dValorC + " 3- " + dValorA);
		    		}
		    		else
		    		{
		    			if (dValorB > dValorA && dValorB > dValorC)
		    			{
		    				if (dValorA > dValorC)
		    					System.out.println("1- " + dValorC + " 2- " + dValorA + " 3- " + dValorB);
		    				else
		    					System.out.println("1- " + dValorA + " 2- " + dValorC + " 3- " + dValorB);
		    			}
		    			else
		    			{
		    				if (dValorC > dValorA && dValorC > dValorB)
		    				{
		    					if (dValorA > dValorB)
		    						System.out.println("1- " + dValorB + " 2- " + dValorA + " 3- " + dValorC);
		    					else
		    						System.out.println("1- " + dValorA + " 2- " + dValorB + " 3- " + dValorC);
		    				}
		    			}
		    		}
		    	}
		    	break;
		    
		    	case 3:
		    	{
		    		if (dValorA > dValorB && dValorA > dValorC)
		    		{
		    			System.out.println("1- " + dValorB + " 2- " + dValorA + " 3- " + dValorC);
		    		}
		    		else if (dValorB > dValorA && dValorB > dValorC)
		    		{
		    			System.out.println("1- " + dValorA + " 2- " + dValorB + " 3- " + dValorC);
		    		}
		    		else
		    		{
		    			System.out.println("1- " + dValorA + "2- " + dValorC + " 3- " + dValorB);
		    		}
		    	}
		    	break;
		    
		    	default:
		    		System.out.println("Opção invalida!!");
			}
		} while (iNumero > 0);
	}
}
