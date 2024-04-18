package com.example.lugaluga.model;

public class Produto {

    private double valor;

    private String nome;

    private String descricao;

    private int quantidade;

    private String status;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Produto(double valor, String nome, String descricao, int quantidade, String status) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.status = status;
    }
}
