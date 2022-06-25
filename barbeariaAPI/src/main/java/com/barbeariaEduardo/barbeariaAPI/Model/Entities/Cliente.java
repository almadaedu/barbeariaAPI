package com.barbeariaEduardo.barbeariaAPI.Model.Entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente extends Pessoa {

    @NotNull
    private String email;


}
