package org.example;

public class Produto {
    private static String nome;
    private double preco;
    private String codigo;
    private int contador = 1;


    public double getPreco() {
        return preco;
    }

    public static String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }


    public Produto(String nome, double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    } // Metodo para facilitar a criaçao do produto

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Código do produto: " + codigo;
    } // Sobreescreveu o ToString para facilitar a vizualizaçao na impressao

}



