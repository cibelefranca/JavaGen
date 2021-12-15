package IntroduçãoPOO;

public class Cliente {

	
	private String nomeCliente;
	private int idade;
	private double altura;
	
	public Cliente ( String nomeCliente, int idade,double altura)
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.altura = altura;
	}
	public void imprimirInfo()
	{
		System.out.println("\n"+nomeCliente+" possui a idade de: "+idade+
				" com a altura de: "+altura);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
	