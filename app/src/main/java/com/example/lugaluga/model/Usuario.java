package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {

    private String nome;

    private String cpf;

    private String datadeNasc;

    private String cep;

    private String municipio;

    private String uf;

    private String logradouro;

    private int numero;

    private String complemento;

    private String bairro;

    private int telefone;

    private String email;

    private String senha;


    protected Usuario(Parcel in) {
        nome = in.readString();
        cpf = in.readString();
        datadeNasc = in.readString();
        cep = in.readString();
        municipio = in.readString();
        uf = in.readString();
        logradouro = in.readString();
        numero = in.readInt();
        complemento = in.readString();
        bairro = in.readString();
        telefone = in.readInt();
        email = in.readString();
        senha = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeString(datadeNasc);
        dest.writeString(cep);
        dest.writeString(municipio);
        dest.writeString(uf);
        dest.writeString(logradouro);
        dest.writeInt(numero);
        dest.writeString(complemento);
        dest.writeString(bairro);
        dest.writeInt(telefone);
        dest.writeString(email);
        dest.writeString(senha);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatadeNasc() {
        return datadeNasc;
    }

    public void setDatadeNasc(String datadeNasc) {
        this.datadeNasc = datadeNasc;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
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
}

