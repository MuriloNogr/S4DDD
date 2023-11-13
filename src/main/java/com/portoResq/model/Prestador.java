package com.portoResq.model;

public class Prestador {
    private int id;
    private String email;
    private String senha;
    private String modeloGuincho;
    private String nome;

    public Prestador(String email, String senha, String modeloGuincho, String nome) {
        this.email = email;
        this.senha = senha;
        this.modeloGuincho = modeloGuincho;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getModeloGuincho() {
        return modeloGuincho;
    }

    public void setModeloGuincho(String modeloGuincho) {
        this.modeloGuincho = modeloGuincho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
