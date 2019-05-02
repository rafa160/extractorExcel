package com.teste.excel.models;

public class Usuario {

    private String nome;
    private String email;
    private double nota1;
    private double nota2;
    private double media;
    private boolean aprovado;

    public Usuario (){

    }

    public Usuario(String nome, String email, double nota1, double nota2, double media, boolean aprovado){
        this.nome = nome;
        this.email = email;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.aprovado = aprovado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
