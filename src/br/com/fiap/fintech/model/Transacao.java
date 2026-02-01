package br.com.fiap.fintech.model;

import java.time.LocalDate;

public abstract class Transacao {
    private String descricao; // "entrada" ou "saida"
    private double valor;
    private LocalDate data;

    public Transacao() {
    }

    public Transacao(String descricao, double valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String tipo) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public abstract String getDetalhamento();


}
