package com.barbeariaEduardo.barbeariaAPI.Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime data;

    @Column(length = 100, nullable = false)
    private String descricao;

    @ManyToOne
    private Servico servico;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Funcionario funcionario;
}
