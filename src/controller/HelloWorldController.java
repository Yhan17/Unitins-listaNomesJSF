package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
//Utilizando View Scoped para continuar em sequencia
@ViewScoped
@Named("helloController")
public class HelloWorldController implements Serializable {

	private static final long serialVersionUID = 4585283208089720699L;
	private String nome;
	private List<String> nomes = new ArrayList<String>();
	private String saudacao = "Nulo";

	public String addNome() {
		nomes.add(nome);
		return "";
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public String getSaudacao() {
		return saudacao;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
