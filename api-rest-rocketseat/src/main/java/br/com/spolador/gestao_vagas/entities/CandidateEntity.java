package br.com.spolador.gestao_vagas.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Entity
@Table(name = "candidates")
@Data // cria os getters and setters
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "o campo nome não deve ser vazio")
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "o campo username não deve conter espaço")
    private String username;

    @Email(message = "O campo deve conter um e-mail valido")
    private String email;

    @Length(min = 8, max = 14, message = "A senha deve conter entre 8 e 14 caracteres")
    private String password;

    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
