package IntroduçãoPOO;

public class exercicioCavalo extends Animal {

	 private String correr;
	 
	 public exercicioCavalo( String nome, int idade, String emiteSom, String correr) 
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
		System.out.println("\n---Dados do Cavalo---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nO Som dele é: "+getEmiteSom()+"\nEle corre? "+getCorrer());
	}
}
