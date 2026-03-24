/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

import java.util.Scanner;

/**
 *
 * @author maxvi
 */
public class ClinicaMedica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = null;
        Pessoa p2 = null;
        Pessoa p3 = null;

        Consulta consulta = null;

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar paciente");
            System.out.println("2. Cadastrar médico");
            System.out.println("3. Agendar consulta");
            System.out.println("4. Listar consultas");
            System.out.println("5. Exibir pessoas cadastradas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeP = sc.nextInt();
                    sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Plano de Saúde: ");
                    String plano = sc.nextLine();

                    Paciente paciente = new Paciente(nomeP, idadeP, cpf, plano);
                    if (p1 == null) p1 = paciente;
                    else if (p2 == null) p2 = paciente;
                    else if (p3 == null) p3 = paciente;
                    else System.out.println("Limite de pessoas atingido!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeM = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeM = sc.nextInt();
                    sc.nextLine();
                    System.out.print("CRM: ");
                    String crm = sc.nextLine();
                    System.out.print("Especialidade: ");
                    String esp = sc.nextLine();

                    Medico medico = new Medico(nomeM, idadeM, crm, new Especialidade(esp));
                    if (p1 == null) p1 = medico;
                    else if (p2 == null) p2 = medico;
                    else if (p3 == null) p3 = medico;
                    else System.out.println("Limite de pessoas atingido!");
                    break;

                case 3:
                    if (p1 instanceof Paciente && p2 instanceof Medico) {
                        System.out.print("Data da consulta: ");
                        String data = sc.nextLine();
                        consulta = new Consulta((Paciente)p1, (Medico)p2, data);
                        System.out.println("Consulta agendada!");
                    } else {
                        System.out.println("É necessário ter pelo menos um paciente e um médico cadastrados!");
                    }
                    break;

                case 4:
                    if (consulta != null) {
                        consulta.exibirConsulta();
                    } else {
                        System.out.println("Nenhuma consulta agendada.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Pessoas cadastradas ---");
                    if (p1 != null) p1.exibirDados();
                    if (p2 != null) p2.exibirDados();
                    if (p3 != null) p3.exibirDados();
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        sc.close();

    }
    
}
