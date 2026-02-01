package br.com.fiap.fintech.view;

import br.com.fiap.fintech.model.Investimento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ViewInvestimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Investimento> investimentos = new ArrayList<>();
        boolean continuar = true;

        System.out.println("\n----- Gerenciador de Investimentos -----");

        do {
            System.out.println("\n------------------------------------------------");
            System.out.println("Cadastrar novo investimento");

            System.out.println("-Descrição do investimento: ");
            String descricao = sc.nextLine();

            System.out.println("Valor (Ex: 50.49): ");
            double valor = sc.nextDouble();
            sc.nextLine();

            System.out.println("Tipo (Ex: Tesouro Direto, CDB): ");
            String tipo = sc.nextLine();

            LocalDate data = LocalDate.now();
            Investimento novoInvestimento = new Investimento(descricao, valor, data, tipo);
            investimentos.add(novoInvestimento);
            System.out.println("\nInvestimento cadastrado! Deseja adicionar outro? (sim/não): ");
            String resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("sim")) {
                continuar = false;
            }
        }while (continuar);

        sc.close();


        double somatorioTotal = 0.0;
        System.out.println("\n----- Resumo dos Investimentos Cadastrados -----");

        for (Investimento investimento : investimentos) {
            if (investimento != null) {
                somatorioTotal += investimento.getValor();
                System.out.printf("- %s (R$ %.2f)\n", investimento.getDescricao(), investimento.getValor());


            } else {
                System.out.println("Investimento nulo");
            }
        }
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Somatório total dos investimentos: R$ %.2f\n", somatorioTotal);
    }
}