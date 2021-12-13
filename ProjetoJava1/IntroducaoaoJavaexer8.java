package ProjetoJava1;

import java.util.Scanner;

public class IntroducaoaoJavaexer8 
{
	
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
	     Scanner leia = new Scanner(System.in);
	     
	     double custoFabrica, custoConsumidor;
	     
	     System.out.println("\nEntre com o custo da Fábrica: ");
	     custoFabrica = leia.nextFloat();
	     
	     custoConsumidor = custoFabrica + ( custoFabrica * 0.73 );
	     
	     System.out.printf("\nCusto ao consumidor R$ % 2.2f " , custoConsumidor);

		

	}
} 
