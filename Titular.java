package Domain;

public class Titular {
	
	private String nome;
	private double saldo;
	private String telefone;
	private String tratamento = "Bem-vindo";
	
	public Titular(String nome) {
		this.nome = nome;
		this.tratamento = "Sr(a)";
	}
	
	public Titular() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return this.tratamento + " " + this.nome;
	}
	
	public void setNome(String titular) {
		this.nome = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
