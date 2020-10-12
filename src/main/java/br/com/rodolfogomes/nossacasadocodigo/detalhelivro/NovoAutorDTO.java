package br.com.rodolfogomes.nossacasadocodigo.detalhelivro;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;


public class NovoAutorDTO {
    @NotBlank
    private String nome;
    @NotBlank
    @URL
    private String linkGitHub;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkGitHub() {
        return linkGitHub;
    }

    public void setLinkGitHub(String linkGitHub) {
        this.linkGitHub = linkGitHub;
    }

    public Autor novoAutor(){
        return new Autor(nome,linkGitHub);
    }

    @Override
    public String toString() {
        return "AutorDTO{" +
                "nome='" + nome + '\'' +
                ", linkGitHub='" + linkGitHub + '\'' +
                '}';
    }
}
