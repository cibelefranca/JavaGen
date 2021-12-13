package AtividadeJava;

import java.util.Scanner;

public class laçodedecisão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int Numero1,Numero2,Numero3;
		
		System.out.println("\nEntre com o primeiro número: ");
		Numero1 = leia.nextInt();
		System.out.println("\nEntre com o segundo Número: ");
		Numero2 = leia.nextInt();
		System.out.println("\nentre com o terceiro Número; ");
		Numero3 = leia.nextInt();
		
		if (Numero1> Numero2 && Numero1> Numero3)
		{
			System.out.println("\nO primeiro numero: " + Numero1 + ", é o maior! " );
		}
		else if (Numero2> Numero1 && Numero2> Numero3)
		{
			System.out.println("\nO segundo numero: "+ Numero2 +", é o maior!");
		}
		else
			System.out.println("\nO terceiro numero: "+ Numero3+", é o maior!");

	}

}
