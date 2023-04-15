package RM94873_Ativ_8;


public class Carteira extends Heranca {
	
	
	/* Diagrama de Classe - Carteira */

	private String conta;
	private String ID;
	private double saldoDebito;
	private double rendinmento;
	/*poupança*/
	private double carteira1;



	public Carteira() {
		
	}
	
			
	public Carteira(String conta, String iD, double saldoDebito, double rendinmento,
			double carteira1) {
		super();
		this.conta = conta;
		ID = iD;
		this.saldoDebito = saldoDebito;
		this.rendinmento = rendinmento;
		this.carteira1 = carteira1;
	}
	
	
	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public double getSaldoDebito() {
		return saldoDebito;
	}


	public void setSaldoDebito(double saldoDebito) {
		this.saldoDebito = saldoDebito;
	}

	public double getRendinmento() {
		return rendinmento;
	}


	public void setRendinmento(double rendinmento) {
		this.rendinmento = rendinmento;
	}


	public double getCarteira1() {
		return carteira1;
	}


	public void setCarteira1(double carteira1) {
		this.carteira1 = carteira1;
	}
	
	/*Classe pessoal operação*/
	public void depositar(double valor) {
		this.saldoDebito += valor;
	}
	
	public void retirar(double valor) {
		this.saldoDebito -= valor;
	}


}