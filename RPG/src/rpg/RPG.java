/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Scanner;

/**
 *
 * @author maxvi
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Personagem personagem = null;
        Inventario inventario = new Inventario();

        int opcao;
        do {
            System.out.println("\n--- MENU RPG ---");
            System.out.println("1. Criar personagem");
            System.out.println("2. Listar personagem");
            System.out.println("3. Atacar");
            System.out.println("4. Exibir status");
            System.out.println("5. Gerenciar inventário");
            System.out.println("6. Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a classe:");
                    System.out.println("1. Guerreiro");
                    System.out.println("2. Mago");
                    System.out.println("3. Arqueiro");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do personagem: ");
                    String nome = sc.nextLine();

                    if (tipo == 1) personagem = new Guerreiro(nome);
                    else if (tipo == 2) personagem = new Mago(nome);
                    else if (tipo == 3) personagem = new Arqueiro(nome);
                    else System.out.println("Classe inválida!");
                    break;

                case 2:
                    if (personagem != null) {
                        personagem.exibirStatus();
                    } else {
                        System.out.println("Nenhum personagem criado.");
                    }
                    break;

                case 3:
                    if (personagem != null) {
                        personagem.atacar();
                    } else {
                        System.out.println("Crie um personagem primeiro.");
                    }
                    break;

                case 4:
                    if (personagem != null) {
                        personagem.exibirStatus();
                    } else {
                        System.out.println("Nenhum personagem criado.");
                    }
                    break;

                case 5:
                    System.out.println("1. Adicionar item");
                    System.out.println("2. Exibir inventário");
                    int invOp = sc.nextInt();
                    sc.nextLine();
                    if (invOp == 1) {
                        System.out.print("Nome do item: ");
                        String itemNome = sc.nextLine();
                        System.out.print("Efeito do item: ");
                        String efeito = sc.nextLine();
                        inventario.adicionarItem(new Item(itemNome, efeito));
                    } else if (invOp == 2) {
                        inventario.exibirInventario();
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        sc.close();

    }
    
}
