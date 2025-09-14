package com.raquel.cadastrodeninjas.Missoes;

import com.raquel.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "missoes") // uma missao para muitos ninjas
    // toda vez que usar um relacionamento entre duas tabelas, precisa mapear as tabelas, voce vai passar o noome da coluna que esta trabalhando lá
    private List<NinjaModel> ninjas;


    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }


}
