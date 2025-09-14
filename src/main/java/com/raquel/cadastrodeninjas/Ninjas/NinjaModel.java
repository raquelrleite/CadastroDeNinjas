package com.raquel.cadastrodeninjas.Ninjas;

import com.raquel.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //transforma uma classe em entidade do BD
@Table(name = "tb_cadastro")
@NoArgsConstructor // Construtor sem argumentos
@AllArgsConstructor // Construtor com todos os argumentos
@Data // Getters and Setters
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Como vai implementar o ID(de um em um, começando do 100, etc)
    private Long id;
    private String nome;
    @Column(unique = true) // email unico, nao pode ter item repetido.
    private String email;
    private String imgUrl;
    private int idade;

    // um ninja tem uma unica missão, muitos ninjas para uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Chave estrangeira
    private MissoesModel missoes;
}
