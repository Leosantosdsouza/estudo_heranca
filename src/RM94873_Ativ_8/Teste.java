package RM94873_Ativ_8;

public class Teste {

	public static void main(String[] args) {
		
		Carteira c = new Carteira();
		c.setConta(" 1234-9 ");
		c.setID(" Leo ");
		c.setSaldoDebito(10.0);
		c.depositar(10);
		c.retirar(5.0);
				
		
		Financia f = new Financia();
		f.setLimiteCredito(1000.0);
		f.compraCredito(40.0);
		/*Quando o Credito Volta para o limite*/
		f.voltaCredito(20.0);


		System.out.println("ID: " + c.getID());
		System.out.println("Numero da Conta: " + c.getConta());
		System.out.println();
		System.out.println("Saldo em Debito: " + c.getSaldoDebito());
		System.out.println();
		System.out.println("Saldo em Credito: " + f.getLimiteCredito());
		
	}
}
