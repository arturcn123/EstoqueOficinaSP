package org.example;

import java.util.ArrayList;
import java.util.List;

public class EstoqueOficina implements EstoquePecas{
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        boolean encontrado = false;

        for(Produto p : produtos) {
            if (p.getCodigo().equals(produto.getCodigo())) {
                encontrado = true;
                p.aumentaQuantidade();
                System.out.println("Quantidade aumentada do produto: " + p.getNome());
                break;
            }
        }
        if (!encontrado) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado com sucesso!" );
     }
    }


    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto " + produto.getNome() + " removido com sucesso!");
    }

    @Override
    public void listaEstoque() {
        for (Produto p : produtos)
            System.out.println("Nome: " + p.getNome() + " Codigo: " + p.getCodigo() + " Preço: " + p.getPreco());
        System.out.println();
    }
    @Override
    public void buscarCodigo(String codigo) {
        for (Produto p : produtos) {
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

