package com.example.lugaluga.model;

public class Produto {

    private String nome;

    private double valor;

    private String descricao;

    private int quantidade;

    private String status;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
    public Produto( String nome, double valor, String descricao, int quantidade, String status) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.status = status;
    }
}
