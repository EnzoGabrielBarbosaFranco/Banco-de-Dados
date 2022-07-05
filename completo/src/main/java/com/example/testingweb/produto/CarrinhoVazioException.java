package com.example.testingweb.produto;

public class CarrinhoVazioException extends Exception {
    @Override
    public String getMessage() {
        return "O carrinho de compras nao pode estar vazio";
    }
}
