package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.math.BigInteger;
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String marca;
    private String categoria;
    private String codigoPeca;
    private int quantidade;
    private BigDecimal valorCusto;
    private BigDecimal valorVenda;

    public String getCategoria() {
        return categoria;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public Long getId() { return id;}

    public String getMarca() { return marca;}

    public BigDecimal getValorCusto() {
        return valorCusto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigoPeca() {
        return codigoPeca;
    }

    public Produto () {}

    public Produto(String descricao, String marca, BigDecimal valorCusto, String codigo) {

        this.descricao = descricao;
        this.marca = marca;
        this.valorCusto = valorCusto;
        this.codigoPeca = codigo;
        this.quantidade = 1;
    } // Metodo para facilitar a criaçao do produto

    public int getQuantidade() {
        return quantidade;
    }

    public void aumentaQuantidade(){
        this.quantidade++;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + ", Preço: R$" + valorCusto + ", Código do produto: " + codigoPeca;
    } // Sobreescreveu o ToString para facilitar a vizualizaçao na impressao

}



