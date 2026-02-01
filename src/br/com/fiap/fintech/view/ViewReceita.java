package br.com.fiap.fintech.view;

import br.com.fiap.fintech.model.Receita;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ViewReceita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Receita> receitas = new ArrayList<>();
        boolean continuar = true;

        System.out.println("\n----- Gerenciador de Receitas -----");

        do {
            System.out.println("\n------------------------------------------------");
            System.out.println("Cadastrar nova receita");

            System.out.println("-Descrição da receita: ");
            String descricao = sc.nextLine();

            System.out.println("Valor (Ex: 50.49): ");
            double valor = sc.nextDouble();
            sc.nextLine();

            System.out.println("Categoria (Ex: Salário, Freelancer): ");
            String fonte = sc.nextLine();

            LocalDate data = LocalDate.now();
            Receita novaReceita = new Receita(descricao, valor, data, fonte);
            receitas.add(novaReceita);
            System.out.println("\nReceita cadastrada! Deseja adicionar outra? (sim/não): ");
            String resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("sim")) {
                continuar = false;
            }
        }while (continuar);

        sc.close();


        double somatorioTotal = 0.0;
        System.out.println("\n----- Resumo das Receitas Cadastradas -----");

        for (Receita receita : receitas) {
            if (receita != null) {
                somatorioTotal += receita.getValor();
                System.out.printf("- %s (R$ %.2f)\n", receita.getDescricao(), receita.getValor());


            } else {
                System.out.println("Receita nula");
            }
        }
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Somatório total das receitas: R$ %.2f\n", somatorioTotal);
    }
}