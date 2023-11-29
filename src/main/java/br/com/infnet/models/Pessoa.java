package br.com.infnet.models;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String perfil;

    public Pessoa(String nome, String telefone, String email, String cpf, String perfil) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.perfil = perfil;
    }
}
