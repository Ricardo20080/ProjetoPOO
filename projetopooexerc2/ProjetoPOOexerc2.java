package projetopooexerc2;

import java.util.Scanner;

public class ProjetoPOOexerc2 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        Material material = null;
        Usuario usuario = null;
        Emprestimo emprestimo = null;

        int opcao = 0;

        do {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Cadastrar material");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Listar material");
            System.out.println("5. Listar empréstimo");
            System.out.println("6. Sair");

            // validação da opção
            while (true) {
                System.out.print("Escolha: ");
                if (sc.hasNextInt()) {
                    opcao = sc.nextInt();
                    sc.nextLine(); // limpar buffer
                    if (opcao >= 1 && opcao <= 6) break;
                    else System.out.println("Digite um número entre 1 e 6!");
                } else {
                    System.out.println("Digite um número válido!");
                    sc.nextLine();
                }
            }

            switch (opcao) {

                case 1: // cadastrar material
                    System.out.println("\n1-Livro 2-Revista 3-TCC");

                    int tipo = 0;
                    while (true) {
                        System.out.print("Tipo: ");
                        if (sc.hasNextInt()) {
                            tipo = sc.nextInt();
                            sc.nextLine();
                            if (tipo >= 1 && tipo <= 3) break;
                            else System.out.println("Escolha 1, 2 ou 3!");
                        } else {
                            System.out.println("Digite um número válido!");
                            sc.nextLine();
                        }
                    }

                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    int ano = 0;
                    while (true) {
                        System.out.print("Ano: ");
                        if (sc.hasNextInt()) {
                            ano = sc.nextInt();
                            sc.nextLine();
                            break;
                        } else {
                            System.out.println("Digite um número válido!");
                            sc.nextLine();
                        }
                    }

                    if (tipo == 1) { // Livro
                        System.out.print("Gênero: ");
                        String genero = sc.nextLine();
                        material = new Livro(titulo, autor, ano, genero);
                    } else if (tipo == 2) { // Revista
                        int edicao = 0;
                        while (true) {
                            System.out.print("Edição: ");
                            if (sc.hasNextInt()) {
                                edicao = sc.nextInt();
                                sc.nextLine();
                                break;
                            } else {
                                System.out.println("Digite um número válido!");
                                sc.nextLine();
                            }
                        }
                        material = new Revista(titulo, autor, ano, edicao);
                    } else { // TCC
                        System.out.print("Curso: ");
                        String curso = sc.nextLine();
                        material = new TCC(titulo, autor, ano, curso);
                    }

                    System.out.println("\n--- Material Cadastrado ---");
                    material.exibirInformacoes();
                    System.out.println("Prazo de empréstimo: " + material.prazoEmprestimo() + " dias");
                    break;

                case 2: // cadastrar usuário
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    usuario = new Usuario(nome, matricula);
                    System.out.println("\n--- Usuário Cadastrado ---");
                    usuario.exibirInformacoes();
                    break;

                case 3: // realizar empréstimo
                    if (usuario == null || material == null) {
                        System.out.println("Cadastre primeiro um usuário e um material!");
                    } else {
                        emprestimo = new Emprestimo(usuario, material);
                        System.out.println("\n--- Empréstimo Realizado ---");
                        emprestimo.exibirInformacoes();
                    }
                    break;

                case 4: // listar material
                    System.out.println("\n--- Material ---");
                    if (material != null) {
                        material.exibirInformacoes();
                        System.out.println("Prazo de empréstimo: " + material.prazoEmprestimo() + " dias");
                    } else {
                        System.out.println("Nenhum material cadastrado.");
                    }
                    break;

                case 5: // listar empréstimo
                    System.out.println("\n--- Empréstimo ---");
                    if (emprestimo != null) {
                        emprestimo.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum empréstimo realizado.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}