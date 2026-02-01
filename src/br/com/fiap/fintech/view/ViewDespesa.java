package br.com.fiap.fintech.view;

import br.com.fiap.fintech.model.Despesa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ViewDespesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Despesa> despesas = new ArrayList<>();
        boolean continuar = true;

        System.out.println("\n----- Gerenciador de Despesas -----");

        do {
            System.out.println("\n------------------------------------------------");
            System.out.println("Cadastrar nova despesa");

            System.out.println("-Descrição da despesa: ");
            String descricao = sc.nextLine();

            System.out.println("Valor (Ex: 50.49): ");
            double valor = sc.nextDouble();
            sc.nextLine();

            System.out.println("Categoria (Ex: Alimentação, Transporte): ");
            String categoria = sc.nextLine();

            LocalDate data = LocalDate.now();
            Despesa novaDespesa = new Despesa(descricao, valor, data, categoria);
            despesas.add(novaDespesa);
            System.out.println("\nDespesa cadastrada! Deseja adicionar outra? (sim/não): ");
            String resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("sim")) {
                continuar = false;
            }
        }while (continuar);

        sc.close();


        double somatorioTotal = 0.0;
        System.out.println("\n----- Resumo das Despesas Cadastradas -----");

        for (Despesa despesa : despesas) {
            if (despesa != null) {
                somatorioTotal += despesa.getValor();
                System.out.printf("- %s (R$ %.2f)\n", despesa.getDescricao(), despesa.getValor());


            } else {
                System.out.println("Despesa nula");
            }
        }
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Somatório total das despesas: R$ %.2f\n", somatorioTotal);
    }
}