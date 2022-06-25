package com.barbeariaEduardo.barbeariaAPI.Model.Entities.dto.Agendamento;

import com.sun.istack.NotNull;

import java.time.LocalDateTime;

public class AgendamentoDTO {

    @NotNull
    Integer funcionario, cliente, servico;

    String descricao;

    @NotNull
    LocalDateTime data;


}
