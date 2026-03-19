
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente[] clientes = new Cliente[10];
        Veiculo[] veiculos = new Veiculo[10];

        int qtdClientes = 0;
        int qtdVeiculos = 0;

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar veículo");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

               
                case 1:
                    Cliente c = new Cliente();

                    System.out.print("Nome: ");
                    c.setNome(sc.nextLine());

                    System.out.print("Idade: ");
                    c.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Telefone: ");
                    c.setTelefone(sc.nextLine());

                    clientes[qtdClientes++] = c;
                    System.out.println("Cliente cadastrado!");
                    break;

                
                case 2:
                    System.out.println("1-Carro | 2-Moto | 3-Caminhão");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Valor diária: ");
                    double diaria = sc.nextDouble();
                    sc.nextLine();

                    if (tipo == 1) {
                        Carro carro = new Carro();
                        carro.setMarca(marca);
                        carro.setModelo(modelo);
                        carro.setValorDiaria(diaria);

                        veiculos[qtdVeiculos++] = carro;

                    } else if (tipo == 2) {
                        Moto moto = new Moto();
                        moto.setMarca(marca);
                        moto.setModelo(modelo);
                        moto.setValorDiaria(diaria);

                        veiculos[qtdVeiculos++] = moto;

                    } else if (tipo == 3) {
                        Caminhao caminhao = new Caminhao();
                        caminhao.setMarca(marca);
                        caminhao.setModelo(modelo);
                        caminhao.setValorDiaria(diaria);

                        veiculos[qtdVeiculos++] = caminhao;
                    }

                    System.out.println("Veículo cadastrado!");
                    break;

               
                case 3:
                    for (int i = 0; i < qtdVeiculos; i++) {
                        veiculos[i].exibirDetalhes();
                        System.out.println("------");
                    }
                    break;
            }

        } while (opcao != 4);

        System.out.println("Fim!");
        sc.close();
    }
    }
    

