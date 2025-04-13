package org.example;

import java.util.ArrayList;

public class EstoqueFiltroOleo implements EstoquePecas{
    ArrayList <Produto> FiltroOleo = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        FiltroOleo.add(produto);
        System.out.println("Produto " + Produto.getNome() + " adicionado com sucesso!" );
    }

    @Override
    public void removerProduto(Produto produto) {
        FiltroOleo.remove(produto);
        System.out.println("Produto " + Produto.getNome() + " removido com sucesso!");
    }

    @Override
    public void listarProduto() {


    }

    @Override
    public void buscarCodigo(String codigo) {

    }
}
