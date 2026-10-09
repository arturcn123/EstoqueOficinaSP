package org.example;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto>findByDescricaoAndMarcaAndCodigoPeca(String descricao, String marca, String codigoPeca);

    Optional<Produto> findByDescricaoOrMarcaOrCodigoPeca(String descricao, String marca, String codigoPeca);

}
