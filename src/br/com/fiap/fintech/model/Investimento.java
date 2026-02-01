package br.com.fiap.fintech.model;

import java.time.LocalDate;

public class Investimento extends Transacao{
    private String tipo;

    public Investimento() {
        super();
    }


    public Investimento(String descricao, double valor, LocalDate data, String tipo) {
        super(descricao, valor, data);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDetalhamento() {
        return "";
    }

}
