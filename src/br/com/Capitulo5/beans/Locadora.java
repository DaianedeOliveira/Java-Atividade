package br.com.Capitulo5.beans;

public class Locadora {

private String nome;
private int cep;
private String cidade;
private int cnpj;



public Locadora() {
	super();
}


public Locadora(String nome, int cep, String cidade, int cnpj) {
	super();
	this.nome = nome;
	this.cep = cep;
	this.cidade = cidade;
	this.cnpj = cnpj;
}


public void setBasico(String nome, String cidade) {
this.nome = nome;
this.cidade = cidade;
}



public String getBasico() {
	return nome + "\n" + cidade;
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCep() {
	return cep;
}
public void setCep(int cep) {
	this.cep = cep;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public int getCnpj() {
	return cnpj;
}
public void setCnpj(int cnpj) {
	this.cnpj = cnpj;
}


	
}


