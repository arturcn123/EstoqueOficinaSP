package org.example;

public class Principal  {
    public static void main(String[] args) {
        Produto filtroOleo1 = new Produto(" Filtro de Oleo fiat fire 1.4 8v", 35.00,  "WO140");
        Produto filtroOleo2 = new Produto(" Filtro de Oleo VW gol 1.6 8v", 35.00,  "WO140");

        EstoqueFiltroOleo estoqueFiltroOleo = new EstoqueFiltroOleo();

        estoqueFiltroOleo.adicionarProduto(filtroOleo1);
        estoqueFiltroOleo.adicionarProduto(filtroOleo2);

        estoqueFiltroOleo.listaEstoque();

        estoqueFiltroOleo.buscarCodigo("WO140");





    }


}