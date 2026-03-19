/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;

/**
 *
 * @author maxvi
 */
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
}

