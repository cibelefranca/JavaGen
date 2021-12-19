package IntroduçãoPOO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exercicioCachorro cachorro1  = new exercicioCachorro("Plínio",3,"Au au au!", "Não corre muito, tem preguiça");
		exercicioCavalo cavalo1= new exercicioCavalo("Pé de pano",8,"IHIHIHIHHIHI!!", " corre muito");
		exercicioBichoPreguica BichoPreguica1= new exercicioBichoPreguica("Costelinha",50,"zZzZzZz", " Sobe em muitas Árvores");
		
		cachorro1.imprimirInfo();
		
		cavalo1.imprimirInfo();
		
		BichoPreguica1.imprimirInfo();
		
	}


}


