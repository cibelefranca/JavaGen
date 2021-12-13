package ProjetoJava1;

import java.util.Scanner;

public class Introducaoaojavaexer5 
{
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in);
			
			float p1, p2, p3, n1, n2, n3, mediaPonderada;
			
			System.out.println("\nInformar o Peso da nota 1: " );
			p1 = leia.nextFloat ();
			System.out.println("\nInformar o Peso da nota 2: " );
			p2 = leia.nextFloat ();
			System.out.println("\nInformar o Peso da nota 3: " );
			p3 = leia.nextFloat ();
			System.out.println("\nInformar a nota 1: " );
			n1 = leia.nextFloat ();
			System.out.println("\nInformar a nota 2: " );
			n2 = leia.nextFloat ();
			System.out.println("\nInformar a nota 3: " );
			n3 = leia.nextFloat ();
			
			
			mediaPonderada = (p1 * n1 + p2 * n2 + p3 * n3) / (p1 + p2 + p3);
		
			System.out.println("\nSua nota média foi de:% 2.2f " + mediaPonderada);

		}


}
