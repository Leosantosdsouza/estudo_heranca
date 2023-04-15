package RM94873_Ativ_8;

public class Heranca {
	/* Diagrama de Classe - Estabelicimento */
	
	public String produto;
	public double valor1;
	public String data;
	
	/* Diagrama de Classe - Compra */
	
	public String estabelecimento;
	public double valor2;
	public String informacao1;
	private double credito;
	private double debito;
	
	/* Diagrama de Classe - Pessoa (Fisica) */
	
	private String cliente2;
	private double dinheiro;
	
	/* Diagrama de Classe - Serviços Contratados */
	
	private String internet;
	private String entreterimento;
	
	/* Diagrama de Classe - Plano Socio */
	
	private String seguro;
	private double cashBack;
	private String promocoes;
	
	/* Diagrama de Classe - Perfil */
	
	private String nome;
	private String ID2;
	private String regiao;
	private double financias;
	private double carteira2;
	private String planosSocio;
	private String servicosContratados;
	
	/* Diagrama de Classe - Login */
	
	private String email;
	private String senha;
	
	/* Diagrama de Classe - Trocar Senha */
	
	private String senha2;
	
	/* Diagrama de Classe - Cadastro */
	
	private String email2;
	private String senha3;
	
	public Heranca() {
		
	}

	public Heranca(String produto, double valor1, String data, String estabelecimento, double valor2,
			String informacao1, double credito, double debito, String cliente2, double dinheiro, String internet,
			String entreterimento, String seguro, double cashBack, String promocoes, String nome, String iD2,
			String regiao, double financias, double carteira2, String planosSocio, String servicosContratados,
			String email, String senha, String senha2, String email2, String senha3) {
		super();
		this.produto = produto;
		this.valor1 = valor1;
		this.data = data;
		this.estabelecimento = estabelecimento;
		this.valor2 = valor2;
		this.informacao1 = informacao1;
		this.credito = credito;
		this.debito = debito;
		this.cliente2 = cliente2;
		this.dinheiro = dinheiro;
		this.internet = internet;
		this.entreterimento = entreterimento;
		this.seguro = seguro;
		this.cashBack = cashBack;
		this.promocoes = promocoes;
		this.nome = nome;
		ID2 = iD2;
		this.regiao = regiao;
		this.financias = financias;
		this.carteira2 = carteira2;
		this.planosSocio = planosSocio;
		this.servicosContratados = servicosContratados;
		this.email = email;
		this.senha = senha;
		this.senha2 = senha2;
		this.email2 = email2;
		this.senha3 = senha3;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public String getInformacao1() {
		return informacao1;
	}

	public void setInformacao1(String informacao1) {
		this.informacao1 = informacao1;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	public String getCliente2() {
		return cliente2;
	}

	public void setCliente2(String cliente2) {
		this.cliente2 = cliente2;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public String getEntreterimento() {
		return entreterimento;
	}

	public void setEntreterimento(String entreterimento) {
		this.entreterimento = entreterimento;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public double getCashBack() {
		return cashBack;
	}

	public void setCashBack(double cashBack) {
		this.cashBack = cashBack;
	}

	public String getPromocoes() {
		return promocoes;
	}

	public void setPromocoes(String promocoes) {
		this.promocoes = promocoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getID2() {
		return ID2;
	}

	public void setID2(String iD2) {
		ID2 = iD2;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public double getFinancias() {
		return financias;
	}

	public void setFinancias(double financias) {
		this.financias = financias;
	}

	public double getCarteira2() {
		return carteira2;
	}

	public void setCarteira2(double carteira2) {
		this.carteira2 = carteira2;
	}

	public String getPlanosSocio() {
		return planosSocio;
	}

	public void setPlanosSocio(String planosSocio) {
		this.planosSocio = planosSocio;
	}

	public String getServicosContratados() {
		return servicosContratados;
	}

	public void setServicosContratados(String servicosContratados) {
		this.servicosContratados = servicosContratados;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getSenha3() {
		return senha3;
	}

	public void setSenha3(String senha3) {
		this.senha3 = senha3;
	}
	
}


	
