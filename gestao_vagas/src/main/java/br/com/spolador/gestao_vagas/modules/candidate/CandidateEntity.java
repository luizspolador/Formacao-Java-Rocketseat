package br.com.spolador.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "O campo username não deve conter espaço")
    @NotBlank
    private String username;

    @Email(message = "Informe um e-mail válido")
    private String email;

    @Length(min = 8, max = 20, message = "A senha deve ter entre 8 e 20 caracteres")
    private String password;
    private String description;
    private String curriculum;


}
