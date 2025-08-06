package org.example;

public class Principal  {
    public static void main(String[] args) {
        Produto filtroOleo1 = new Produto(" Filtro de Oleo fiat fire 1.4 8v","Fram",35.00,  "PH5266");
        Produto filtroOleo2 = new Produto(" Filtro de Oleo VW gol 1.6 8v 2010 (EA111)", "Fram", 35.00,  "PH3614");

        EstoqueOficina estoqueOficina = new EstoqueOficina();

        estoqueOficina.adicionarProduto(filtroOleo1);
        estoqueOficina.adicionarProduto(filtroOleo2);

        estoqueOficina.listaEstoque();

        estoqueOficina.buscarCodigo("WO140");

        Produto filtroOleoChevrolet = new Produto("Filtro de Oleo Chevrolet 1.8/2.0 8v","Fram", 35.00, "Fram PH3387A");

        estoqueOficina.adicionarProduto(filtroOleoChevrolet);

        estoqueOficina.listaEstoque();



    }


}