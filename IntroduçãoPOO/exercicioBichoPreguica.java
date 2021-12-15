package IntroduçãoPOO;

public class exercicioBichoPreguica extends Animal {

	private String subirNaArvore;
	
	public exercicioBichoPreguica(String nome, int idade, String emiteSom, String subirNaArvore)
	{
		super (nome, idade, emiteSom);
		this.subirNaArvore = subirNaArvore;
		
	}

	public String getSubirNaArvore() {
		return subirNaArvore;
	}

	public void setSubirNaArvore(String subirNaArvore) {
		this.subirNaArvore = subirNaArvore;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n---Dados da Preguiça---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getEmiteSom()+"\nEle sobe em arvores?"+getSubirNaArvore());
	}
}
