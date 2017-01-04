package Domain;
import Domain.Titular;

public class Conta {
	
	Titular titular = new Titular();
	public double saldo = 500;
	
	public Conta(String titularn) {
		titular.setNome(titularn);
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
		System.out.println("O saldo atual é: " + saldo + ".");
	}
	
	public String getTitular() {
		return this.titular.getNome();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
	
		return " Conta >> [Titular: "+ titular +"]." + "\n[Saldo: "+ saldo + "].";
	}
	
}
