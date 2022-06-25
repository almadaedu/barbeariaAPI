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
@Table(name = "FUNCIONARIO")
public class Funcionario extends Pessoa {

    @Column(length = 100, nullable = true)
    private String cargo;

    @OneToMany(mappedBy = "funcionario")
    private List<Agendamento> agendamento;
}
