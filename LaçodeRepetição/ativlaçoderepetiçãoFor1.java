package La�odeRepeti��o;

import java.util.Scanner;

public class ativla�oderepeti��oFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int x;
		
		for(x = 1000 ; x <= 1999 ; x ++ )
		{
			if (x %  11  ==  5 )
			{
				System.out.println("\n " + x);
			}
		}
	}

}
