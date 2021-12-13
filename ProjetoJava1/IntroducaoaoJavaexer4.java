package ProjetoJava1;

import java.util.Scanner;

public class IntroducaoaoJavaexer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner leia = new Scanner(System.in);
     
     int A,B,C;
     double D,R,S;
      System.out.println("\nEscreva o valor de A: ");
      A = leia.nextInt();
      System.out.println("\nEscreva o valor de B: ");
      B = leia.nextInt();
      System.out.println("\nEscreva o valor de C: ");
      C = leia.nextInt();
      
      R = Math.pow(A+B,2);
      S = Math.pow(B+C,2);
      D = (R+2)/2;
    System.out.println("\nO resultado de D é : " +D);
	}

}
