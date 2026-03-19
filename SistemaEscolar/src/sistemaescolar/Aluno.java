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
public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

    

