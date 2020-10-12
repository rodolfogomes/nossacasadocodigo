package br.com.rodolfogomes.nossacasadocodigo.detalhelivro;

import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;
@Entity
public class Autor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private @NotBlank String nome;
    private @NotBlank @URL String linkGitHub;
    @PastOrPresent
    private LocalDateTime createdAt = LocalDateTime.now();

    public Autor(){}

    public Autor(@NotBlank String nome, @NotBlank @URL String linkGitHub) {
        this.nome = nome;
        this.linkGitHub = linkGitHub;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", linkGitHub='" + linkGitHub + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
