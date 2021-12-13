package LaçodeRepetição;

import java.util.Scanner;

public class ativlaçoderepetiçãoDoWhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num, contador = 0;
		
		System.out.printf("\nDigite um numero: ");
		 num = leia.nextInt();
		
		do
		{
			contador = contador + num ;
			
			if(num != 0)
			{
			
		    System.out.printf("Digite um numero: ");
			num = leia.nextInt();
			
			}
			
		}
		while(num != 0);
			System.out.printf("\n===================================================");
			System.out.printf("\nA soma dos numeros digitados é de %d ",contador);
			System.out.printf("\n===================================================");
		


	}

}
