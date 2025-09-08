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
    @OneToMany(mappedBy = "missoes") // uma missao pode ter muitos ninjas
    private List<NinjaModel> ninjas;


    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }


}
