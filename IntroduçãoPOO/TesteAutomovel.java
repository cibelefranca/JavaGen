package Introdu��oPOO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Automovel auto1 = new Automovel("Evandro","Jeep Wrangler","STH216",2021);
		auto1.imprimirInfo();
		System.out.println("\n****Transfer�ncia de Propriet�rio***");
		auto1.setNomeProprietario("Brenda Paiva");
		auto1.setPlaca("YRD325");
		auto1.imprimirInfo();
	}

}

