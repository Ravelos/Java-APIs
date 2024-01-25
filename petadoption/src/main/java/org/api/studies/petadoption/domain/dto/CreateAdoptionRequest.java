package org.api.studies.petadoption.domain.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateAdoptionRequest {

    @NotNull(message = "Nome deve ser definido")
    private String nome;

    @NotNull(message = "Idade deve ser definida")
    private int idade;

    @Pattern(
            regexp = "^(Cachorro|Gato|Coelho|Capivara)$",
            message = "A espécie deve ser Cachorro, Gato, Coelho ou Capivara."
    )
    private String especie;

    private LocalDate dataNascimento;

    @Min(value = 1, message = "O nível deve se no mínimo 1")
    @Max(value = 5, message = "O nível não pode ser maior que 5")
    private int nivelFofura;

    @Min(value = 1, message = "O nível deve se no mínimo 1")
    @Max(value = 5, message = "O nível não pode ser maior que 5")
    private int nivelCarinho;

    @Email
    @NotNull(message = "Email deve ser definido.")
    private String email;
}
