package br.trimestral.senai.trimestral.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public class Fornecedor {

    @Id
    private Long id;

    @Column(name = "nome")

    @Size(max = 150)
    private String nome;

    @Size(max = 100)
    private String email;

    @Size(max = 60)
    private String telefone;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
