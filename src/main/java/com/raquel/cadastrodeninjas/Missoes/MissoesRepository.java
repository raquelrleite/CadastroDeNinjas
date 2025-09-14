package com.raquel.cadastrodeninjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
/*
    JPA é uma abstração para trabalhar com banco de dados. Uma abstração é uma forma de deixar mais
    fácil o entendimento, simplificando. É pra não precisar digitar tanta coisa sobre o banco de dados.
 */
}
