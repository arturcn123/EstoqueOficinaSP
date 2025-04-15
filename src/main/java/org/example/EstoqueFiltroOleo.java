package org.example;

import java.util.ArrayList;

public class EstoqueFiltroOleo implements EstoquePecas{
    private ArrayList <Produto> FiltroOleo = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {

        FiltroOleo.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado com sucesso!" );
    }

    @Override
    public void removerProduto(Produto produto) {
        FiltroOleo.remove(produto);
        System.out.println("Produto " + produto.getNome() + " removido com sucesso!");
    }

    @Override
    public void listaEstoque() {
        for (Produto p : FiltroOleo)
            System.out.println("Nome: " + p.getNome() + " Codigo: " + p.getCodigo() + " Preço: " + p.getPreco());
        System.out.println();
    }
    @Override
    public void buscarCodigo(String codigo) {
        for (Produto p : FiltroOleo) {
            if (p.getCodigo().equals(codigo)) {
                System.out.println("Produto encontrado: " + p.getNome());
                return;
            }
        }
        System.out.println("Produto com código " + codigo + " não encontrado.");
    }
}

