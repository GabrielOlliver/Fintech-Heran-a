package br.com.fiap.fintech.view;


import br.com.fiap.fintech.model.Despesa;
import br.com.fiap.fintech.model.Investimento;
import br.com.fiap.fintech.model.Receita;
import br.com.fiap.fintech.model.Transacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transacao> ListaDeTransacoes = new ArrayList<>();

        ListaDeTransacoes.add(new Despesa("Supermercado", 250.00, LocalDate.now(), "Alimentação"));
        ListaDeTransacoes.add(new Receita("Salário", 3000.00, LocalDate.now(), "Emprego"));
        ListaDeTransacoes.add(new Investimento("Ações XPTO", 500.00, LocalDate.now(), "Renda Variável"));

        for (Transacao transacao : ListaDeTransacoes) {
            System.out.println("Descrição: " + transacao.getDescricao() + " | Valor: " + transacao.getValor() + " | Data: " + transacao.getData());
        }
    }
}