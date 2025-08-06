package org.example;

public class Produto {
    private String marca;
    private String nome;
    private double preco;
    private String codigo;
    private int quantidade;


    public String getMarca() { return marca;}

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }


    public Produto(String nome, String marca, double preco, String codigo) {

        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = 1;
    } // Metodo para facilitar a criaçao do produto

    public int getQuantidade() {
        return quantidade;
    }

    public void aumentaQuantidade(){
        this.quantidade++;
    }


    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Código do produto: " + codigo;
    } // Sobreescreveu o ToString para facilitar a vizualizaçao na impressao

}



