package org.example;

public interface EstoquePecas {

   public void adicionarProduto(String nome, int codigo);
   public void removerProduto(String nome, int codigo);
   public void listarProduto();
   public void buscarCodigo(int codigo);
}

