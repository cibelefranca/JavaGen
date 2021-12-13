package AtividadeJava;

import java.util.Scanner;

public class laçodedecisão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int Numero1,Numero2,Numero3;
		
		System.out.println("\nEscreva o numero 1: ");
	    Numero1 = leia.nextInt();
	    System.out.println("\nEscreva o numero 2: ");
	    Numero2 = leia.nextInt();
	    System.out.println("\nEscreva o numero 3: ");
	    Numero3 = leia.nextInt();
	    
	    if (Numero1 < Numero2 && Numero2 < Numero3)
	    {
			System.out.println("\nOrdem crescente dos números são: " + Numero1 + " , " + Numero2 + " , " + Numero3);
		} 
	    else if((Numero1< Numero2 && Numero3< Numero2) && Numero1 < Numero3)
	    {
	    	System.out.println("\nOrdem crescente dos números são: "+ Numero1+ ", "+ Numero3+", "+ Numero2);
	    }
	    else  if (Numero2 < Numero1 && Numero1 < Numero3) 
	    {
			System.out.println("\nOrdem crescente dos números são: "+ Numero2+ ", " + Numero1+ ", "+ Numero3);
		} else  if (Numero2 < Numero1 && Numero2 < Numero3)
		{
			System.out.println("\nOrdem crescente dos números são: " + Numero2+ ", " + Numero3 + ", "+ Numero1);
		}
		else  if (Numero3 < Numero1 && Numero1 < Numero2)
		{
			System.out.println("\nOrdem crescente dos números são: " + Numero3 + ", " + Numero1 + ", " + Numero2);
		} 
		else
		{	
			System.out.printf( " Ordem crescente dos números são: " + Numero3 + ", " + Numero2 + ", " + Numero1);
		}






	}

}
