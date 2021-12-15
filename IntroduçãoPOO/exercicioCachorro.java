package IntroduçãoPOO;

public class exercicioCachorro extends Animal{

	private String correr; 
	
	public exercicioCachorro(String nome, int idade, String emiteSom, String correr)
	{
		super (nome, idade, emiteSom);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public void imprimirInfo()
	{
		System.out.println("\n---Dados do Cachorro---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getEmiteSom()+"\nEle corre? "+getCorrer());
	}
}
