package Introdu��oPOO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exercicioCachorro cachorro1  = new exercicioCachorro("Pl�nio",3,"Au au au!", "N�o corre muito, tem pregui�a");
		exercicioCavalo cavalo1= new exercicioCavalo("P� de pano",8,"IHIHIHIHHIHI!!", " corre muito");
		exercicioBichoPreguica BichoPreguica1= new exercicioBichoPreguica("Costelinha",50,"zZzZzZz", " Sobe em muitas �rvores");
		
		cachorro1.imprimirInfo();
		
		cavalo1.imprimirInfo();
		
		BichoPreguica1.imprimirInfo();
		
	}


}


