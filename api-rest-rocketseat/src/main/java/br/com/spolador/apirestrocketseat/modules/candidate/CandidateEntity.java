package br.com.spolador.apirestrocketseat.modules.candidate;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@Entity
@Data
public class CandidateEntity {
    @Id
    private UUID id;

    @NotBlank(message = "o campo nome não deve ser vazio")
    private String name;

    @Pattern(regexp = "\\S+", message = "o campo username não deve conter espaço")
    private String username;

    @Email(message = "O campo deve conter um e-mail valido")
    private String email;

    @Length(min = 8, max = 14, message = "A senha deve conter entre 8 e 14 caracteres")
    private String password;

    private String description;
    private String curriculum;

}
