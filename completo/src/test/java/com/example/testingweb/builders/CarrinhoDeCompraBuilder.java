package com.example.testingweb.builders;

import java.util.ArrayList;
import java.util.List;

import com.example.testingweb.carrinho.CarrinhoDeCompra;
import com.example.testingweb.carrinho.ItemDoCarrinho;
import com.example.testingweb.produto.Produto;
import com.example.testingweb.produto.ValorInvalido;

public class CarrinhoDeCompraBuilder {

    private static final int UM = 1;
    private Produto geladeira;
    private Produto liquidificador;
    private Produto pratos;
    private List<ItemDoCarrinho> itens = new ArrayList<>();

    public CarrinhoDeCompraBuilder() throws ValorInvalido {
        geladeira = new Produto("Geladeira", 450.0);
        liquidificador = new Produto("Liquidificador", 250.0);
        pratos = new Produto("Jogo de pratos", 70.0);
    }

    public CarrinhoDeCompraBuilder emOrdemCrescente() {
        itens.add(new ItemDoCarrinho(pratos, UM));
        itens.add(new ItemDoCarrinho(liquidificador, UM));
        itens.add(new ItemDoCarrinho(geladeira, UM));
        return this;
    }

    public CarrinhoDeCompraBuilder comItemDoCarrinho(ItemDoCarrinho itemDoCarrinho) {
        itens.add(itemDoCarrinho);
        return this;
    }

    public CarrinhoDeCompra construir() {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        for (ItemDoCarrinho itemDoCarrinho : itens) {
            carrinhoDeCompra.adicionar(itemDoCarrinho);
        }
        return carrinhoDeCompra;
    }

}
