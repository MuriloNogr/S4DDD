package com.portoResq.model;

public class Prestador {
    private int id;
    private String email;
    private String senha;
    private String modeloGuincho;
    private String nome;

    // Construtores
    public Prestador() {}

    // Getters e Setters
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

    // Continuação dos getters e setters para os outros campos...
}

