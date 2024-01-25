package org.api.studies.petadoption.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PetRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    @Pattern(
            regexp = "^(Cachorro|Gato|Coelho|Capivara)$",
            message = "A espécie deve ser Cachorro, Gato, Coelho ou Capivara."
    )
    private String especie;

    @Column
    private LocalDate dataNascimento;

    @Column
    @Min(value = 1, message = "O nível deve se no mínimo 1")
    @Max(value = 5, message = "O nível não pode ser maior que 5")
    private int nivelFofura;

    @Column
    @Min(value = 1, message = "O nível deve se no mínimo 1")
    @Max(value = 5, message = "O nível não pode ser maior que 5")
    private int nivelCarinho;

    @Column
    @Email
    @NotBlank
    private String email;

}
