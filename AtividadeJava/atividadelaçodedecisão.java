package AtividadeJava;

import java.util.Scanner;

public class atividadela�odedecis�o {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.println("\nDigite sua idade: ");
        idade = leia.nextInt();

        if (idade>=10 && idade <=14)
        {
            System.out.println("\nVoc� se clasifica como Infantil.");
        }

        else if (idade>=15 && idade <=17)
        {
            System.out.println("\nVoc� se classifica como Juvenil.");
        }
        else if (idade >=18 && idade <=25)
        {
            System.out.println("\nVoc� se classifica como Adulto.");
        }
        else 
        {
        	System.out.println("\nIdade inv�lida.");
        }

    }

}
