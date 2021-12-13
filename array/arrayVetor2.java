package array;

import java.util.Scanner;

public class arrayVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner leia = new Scanner(System.in);
	
	int x,somaPar=0,contImpar=0,numero;
	int[] a = new int [6];
			              
	
	
	for(x=0;x<6;x++)
	{
		System.out.printf("\nEntre com um número: ");
		numero=leia.nextInt();
					
		a[x]=numero;
		
		if(a[x]%2==0)
		{
			somaPar+=a[x];
			
		}
		else
		{
			contImpar++;
			
		}
		
	}
	System.out.println("\nA somatória dos números pares é de "+somaPar);
	System.out.println("\nA quantidade de números ímpares é de "+contImpar);
	
	System.out.println("\nOs números pares digitados foram: ");
	for(x=0;x<6;x++) 
	{ 
		if(a[x]%2==0)
		{
			System.out.println(a[x]);
		}
		
	}
	System.out.println("\nOs números ímpares digitados foram: ");
	for(x=0;x<6;x++)
	{
		if(a[x]%2!=0)
		{
			System.out.println(a[x]);
		}
	}
}

}