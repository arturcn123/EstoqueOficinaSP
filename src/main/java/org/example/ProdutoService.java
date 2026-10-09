package org.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //cadastrar um novo produto
    //busco, se achei, senao
    public Produto cadastrarProduto(Produto produto) {

        Optional<Produto> existente = produtoRepository.findByDescricaoAndMarcaAndCodigoPeca(
                produto.getDescricao(),
                produto.getMarca(),
                produto.getCodigoPeca()
        );

        if (existente.isPresent()) {
            Produto produtoExistente = existente.get();

            int novaQuantidade = produtoExistente.getQuantidade() + produto.getQuantidade();
            produtoExistente.setQuantidade(novaQuantidade);
            return produtoRepository.save(produtoExistente);
        } else {
            return produtoRepository.save(produto);
        }
    }
    //registrar entrada de produto. aonde vai poder add o numero q quiser
//    public Produto adicionarProduto (Produto produto){}

    // registrar saida de produto. mesma coisa so q remover. impedindo se quantidade for maior q o estoque
    public Produto saidaProduto(Long id, int quantidade) {

        Optional<Produto> existente = produtoRepository.findById(id);

        if (existente.isPresent()) {
            Produto produtoExistente = existente.get();

            if (produtoExistente.getQuantidade() >= quantidade) {
                int novaQuantidade = produtoExistente.getQuantidade() - quantidade;
                produtoExistente.setQuantidade(novaQuantidade); // 1. colocar novaQuantidade dentro do produtoExistente
                return produtoRepository.save(produtoExistente); // 2. salvar o produtoExistente e devolver
            } else {
                throw new IllegalArgumentException("Quantidade no estoque abaixo do pedido, a quantidade pra esse produto e de:" + produtoExistente.getQuantidade());
                // quantidade acima do estoque
            }
        } else {
            throw new IllegalArgumentException("Produto nao existe no estoque!");
        }
    }
    //vizualizar informacoes do produto
    public Produto visualizarEstoque (Produto produto){


    }
    //vizualizar estoque completo

}
