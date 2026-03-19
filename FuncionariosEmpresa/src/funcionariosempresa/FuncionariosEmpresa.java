package funcionariosempresa;

import java.util.Scanner;

public class funcionariosEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f1 = null;
        Funcionario f2 = null;
        Funcionario f3 = null;

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Calcular folha de pagamento");
            System.out.println("4. Exibir por cargo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de funcionário deseja cadastrar?");
                    System.out.println("1. Vendedor");
                    System.out.println("2. Gerente");
                    System.out.println("3. Estagiário");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    Funcionario novo = null;

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    if (tipo == 1) {
                        Vendedor v = new Vendedor();
                        v.setNome(nome);
                        v.setIdade(idade);
                        v.setCargo(cargo);
                        v.setSalario(salario);
                        System.out.print("Comissão: ");
                        v.setComissao(sc.nextDouble());
                        System.out.print("Total de vendas: ");
                        v.setTotalVendas(sc.nextDouble());
                        System.out.print("Meta mensal: ");
                        v.setMetaMensal(sc.nextDouble());
                        novo = v;
                    } else if (tipo == 2) {
                        Gerente g = new Gerente();
                        g.setNome(nome);
                        g.setIdade(idade);
                        g.setCargo(cargo);
                        g.setSalario(salario);
                        System.out.print("Departamento: ");
                        g.setDepartamento(sc.nextLine());
                        System.out.print("Nível de supervisão: ");
                        g.setNivelSupervisao(sc.nextInt());
                        System.out.print("Bônus: ");
                        g.setBonus(sc.nextDouble());
                        novo = g;
                    } else if (tipo == 3) {
                        Estagiario e = new Estagiario();
                        e.setNome(nome);
                        e.setIdade(idade);
                        e.setCargo(cargo);
                        e.setSalario(salario);
                        System.out.print("Horas trabalhadas: ");
                        e.setHorasTrabalhadas(sc.nextInt());
                        System.out.print("Bolsa: ");
                        e.setBolsa(sc.nextDouble());
                        sc.nextLine();
                        System.out.print("Curso: ");
                        e.setCurso(sc.nextLine());
                        novo = e;
                    }

                    if (f1 == null) {
                        f1 = novo;
                    } else if (f2 == null) {
                        f2 = novo;
                    } else if (f3 == null) {
                        f3 = novo;
                    } else {
                        System.out.println("Limite de funcionários atingido!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Funcionários ---");
                    if (f1 != null) f1.calcularSalario();
                    if (f2 != null) f2.calcularSalario();
                    if (f3 != null) f3.calcularSalario();
                    break;

                case 3:
                    double totalFolha = 0;
                    if (f1 != null) totalFolha += f1.getSalario();
                    if (f2 != null) totalFolha += f2.getSalario();
                    if (f3 != null) totalFolha += f3.getSalario();
                    System.out.println("Total da folha de pagamento: R$ " + totalFolha);
                    break;

                case 4:
                    System.out.print("Digite o cargo para filtrar: ");
                    String filtroCargo = sc.nextLine();
                    if (f1 != null && f1.getCargo().equalsIgnoreCase(filtroCargo)) f1.calcularSalario();
                    if (f2 != null && f2.getCargo().equalsIgnoreCase(filtroCargo)) f2.calcularSalario();
                    if (f3 != null && f3.getCargo().equalsIgnoreCase(filtroCargo)) f3.calcularSalario();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
       
       
    }
    
}
