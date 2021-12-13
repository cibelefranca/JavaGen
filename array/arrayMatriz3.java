package array;

import java.util.Scanner;

public class arrayMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[][] numero = new int[3][3];
		int linha,coluna,cont=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número ");
				numero[linha][coluna]=leia.nextInt();
				
				if(numero[linha][coluna]>10)
				{
					cont++;
				}
				
			}
		}
		System.out.printf("\nForam informados %d números maiores que 10 para matriz.",cont);


	}

}
