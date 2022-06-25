package com.barbeariaEduardo.barbeariaAPI.Model.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity

@Table(name = "SERVICO")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @OneToMany(mappedBy = "servico")
    private List<Agendamento> agendamento;
}
