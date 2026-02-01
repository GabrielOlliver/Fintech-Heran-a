package br.com.fiap.fintech.model;

import java.time.LocalDate;

public class Despesa extends Transacao{
    private String categoria;

    public Despesa() {
        super();
    }


    public Despesa(String descricao, double valor, LocalDate data, String categoria) {
        super(descricao, valor, data);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getDetalhamento() {
        return "";
    }

}
