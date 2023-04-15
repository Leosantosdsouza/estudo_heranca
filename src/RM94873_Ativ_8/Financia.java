package RM94873_Ativ_8;


public class Financia extends Carteira {
	
	
	/* Diagrama de Classe - Financias */
	
	private String itens;
	private String valoresMes;
	private String informacao2;
	private double totalGasto;
	private double limiteCredito;
	
	public Financia() {
		
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	public String getValoresMes() {
		return valoresMes;
	}

	public void setValoresMes(String valoresMes) {
		this.valoresMes = valoresMes;
	}

	public String getInformacao2() {
		return informacao2;
	}

	public void setInformacao2(String informacao2) {
		this.informacao2 = informacao2;
	}

	public double getTotalGasto() {
		return totalGasto;
	}

	public void setTotalGasto(double totalGasto) {
		this.totalGasto = totalGasto;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	

	public void compraCredito(double compra) {
		this.limiteCredito -= compra;
	}
	public void voltaCredito(double Credito) {
		this.limiteCredito += Credito;
	
	}
}
