package La�odeRepeti��o;

import java.util.Scanner;

public class ativla�oderepeti��owhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int  idade, menor = 0, metade = 0, maior = 0;
		
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
			System.out.printf("Digite sua idade: ");
			idade = leia.nextInt();
			
			 if(idade <= 21)
			 {
				 menor++ ;
			 }
			 else if(idade >= 50 )
			 {
				 maior++ ;
			 }
			 else
			 {
				 metade ++;
			 }
		}
		System.out.printf("\n===================================================");
		System.out.printf("\nTotal de pessoas com menos de 21 � de %d ",menor);
		System.out.printf("\nTotal de pessoas com mais de 50 � de %d ",maior);
		System.out.printf("\nTotal de pessoas entre 21 e 50 � de %d",metade);
		System.out.printf("\n===================================================");
		
		



	}

}
