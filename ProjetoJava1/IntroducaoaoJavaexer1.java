package ProjetoJava1;

import java.util.Scanner;

public class IntroducaoaoJavaexer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int idade, anos, meses, resp1, dias;
		
		System.out.println("\nQuantos anos voc� tem? \nR:");
		anos = leia.nextInt();
		System.out.println("\nQuantos meses voc� tem? \nR:");
		meses = leia.nextInt();
		System.out.println("\nQuantos dias voc� tem? \nR:");
		dias = leia.nextInt();
		
		resp1 = (365*anos) +(meses*30)+dias;
				System.out.println("\nSua idade em dias: "+resp1+ " dias.");
				

		

		

	}

}

