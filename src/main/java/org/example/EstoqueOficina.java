package org.example;

import java.util.ArrayList;

public class EstoqueFiltroOleo implements EstoquePecas{
    private ArrayList <Produto> FiltroOleo = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        boolean encontrado = false;

        for(Produto p : FiltroOleo) {
            if (p.getCodigo().equals(produto.getCodigo())) {
                encontrado = true;
                p.aumentaQuantidade();
                System.out.println("Quantidade aumentada do produto: " + p.getNome());
                break;
            }
        }
        if (!encontrado) {
        FiltroOleo.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado com sucesso!" );
     }
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
                System.out.println("Produto encontrado:\n " + p.getNome() +
                        "\n Preço: R$" + p.getPreco() +
                        "\n Quantidade: " + p.getQuantidade());
                return;
            }
        }
        System.out.println("Produto com código " + codigo + " não encontrado.");
    }
}

