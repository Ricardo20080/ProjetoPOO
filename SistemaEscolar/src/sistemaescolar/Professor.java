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
public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
    }
}

