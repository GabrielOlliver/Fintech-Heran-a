package br.com.fiap.fintech.view;

import br.com.fiap.fintech.model.Usuario;

import java.util.Scanner;

public class ViewUsuario {
    private static void exibirMenu() {
        System.out.println("Selecione uma operação:");
        System.out.println("1-Cadastrar/Alterar usuário");
        System.out.println("2-Exibir usuário");
        System.out.println("3-Sair");
        System.out.println("Digite o número da opção ");
    }

    private static Usuario cadastrarUsuario() {
        Usuario usuario = new Usuario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do usuário: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o CPF do usuário: ");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe um e-mail: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Cadastre uma senha: ");
        usuario.setSenha(sc.nextLine());
        return usuario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = null;
        int op;
        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op){
                case 1:
                    usuario = cadastrarUsuario();
                    break;
                case 2:
                    if (usuario != null)
                        System.out.println(usuario.getDetalhamento());
                    else
                        System.out.println("Nenhum usuário cadastrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 3);

        sc.close();
    }
}
