
package sistemaescolar;

import java.util.Scanner;

/**
 *
 * @author maxvi
 */
public class SistemaEscolar {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = null;
        Pessoa p2 = null;
        Pessoa p3 = null;

        Turma turma = null;

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Cadastrar professor");
            System.out.println("3. Cadastrar funcionário");
            System.out.println("4. Criar turma");
            System.out.println("5. Listar pessoas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeA = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeA = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    Aluno aluno = new Aluno(nomeA, idadeA, matricula, curso);
                    if (p1 == null) p1 = aluno;
                    else if (p2 == null) p2 = aluno;
                    else if (p3 == null) p3 = aluno;
                    else System.out.println("Limite de pessoas atingido!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeP = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = sc.nextLine();
                    System.out.print("Salário: ");
                    double salarioP = sc.nextDouble();

                    Professor prof = new Professor(nomeP, idadeP, disciplina, salarioP);
                    if (p1 == null) p1 = prof;
                    else if (p2 == null) p2 = prof;
                    else if (p3 == null) p3 = prof;
                    else System.out.println("Limite de pessoas atingido!");
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeF = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Salário: ");
                    double salarioF = sc.nextDouble();

                    Funcionario func = new Funcionario(nomeF, idadeF, cargo, salarioF);
                    if (p1 == null) p1 = func;
                    else if (p2 == null) p2 = func;
                    else if (p3 == null) p3 = func;
                    else System.out.println("Limite de pessoas atingido!");
                    break;

                case 4:
                    System.out.print("Código da turma: ");
                    String codigo = sc.nextLine();
                    System.out.print("Curso: ");
                    String cursoT = sc.nextLine();
                    turma = new Turma(codigo, cursoT);
                    System.out.println("Turma criada com sucesso!");
                    break;

                case 5:
                    System.out.println("\n--- Pessoas cadastradas ---");
                    if (p1 != null) p1.exibirPerfil();
                    if (p2 != null) p2.exibirPerfil();
                    if (p3 != null) p3.exibirPerfil();
                    if (turma != null) turma.exibirTurma();
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
