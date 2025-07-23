package org.example;

public class Altura {
    private String nome;
    private int oitava;

    public Altura(String nome, int oitava) {
        this.nome = nome;
        this.oitava = oitava;
    }

    public String getNome() {
        return nome;
    }

    public int getOitava() {
        return oitava;
    }

    @Override
    public String toString() {
        return nome + oitava;
    }
}