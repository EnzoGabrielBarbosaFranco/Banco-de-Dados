package com.example.testingweb.produto;

import javax.persistence.Entity;

import com.example.testingweb.EntidadeBase;

@Entity
public class Produto extends EntidadeBase {

	private double valorUnitario;
	private String descricao;
	
	Produto(){
	}

	public Produto(String descricao, double valorUnitario) throws ValorInvalido {
		verificarSeValorMenorQueZero(valorUnitario);
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	private void verificarSeValorMenorQueZero(double valorUnitario) throws ValorInvalido {
		if(valorUnitario < 0) {
			throw new ValorInvalido();
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	@Override
	public boolean equals(Object obj) {
		Produto objeto = (Produto) obj;
		return this.descricao.equals(objeto.descricao);
	}
}
