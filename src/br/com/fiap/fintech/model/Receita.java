package br.com.fiap.fintech.model;

import java.time.LocalDate;

public class Receita extends Transacao{
    private String fonte;

    public Receita() {
        super();
    }


    public Receita(String descricao, double valor, LocalDate data, String fonte) {
        super(descricao, valor, data);
        this.fonte = fonte;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public String getDetalhamento() {
        return "";
    }

}
