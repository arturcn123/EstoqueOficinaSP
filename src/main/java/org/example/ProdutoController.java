package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @PostMapping("/entrada")
    public Produto cadastrarProduto (@RequestBody Produto produto){
        return produtoService.cadastrarProduto(produto);
    }

    @PostMapping("/saida")
    public Produto saidaProduto(@RequestParam Long id, @RequestParam int quantidade) {
        return produtoService.saidaProduto(id, quantidade);
    }
}