package IntroduçãoPOO;

public class Avião {

	private String companhiaAerea;
	private String cor;
	private String modelo;
	private int ano;
	
	public Avião (String companhiaAerea, String cor, String modelo, int ano)
	{
		this.companhiaAerea = companhiaAerea;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
	}
	public void imprimirInfo()
	{
		System.out.println("\n"+companhiaAerea+" possui a cor "+cor+
				" no modelo: "+modelo+" e foi fabricado no ano de: "+ano);
	}
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
