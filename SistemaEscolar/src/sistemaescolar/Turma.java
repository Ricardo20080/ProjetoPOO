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
public class Turma {
    private String codigo;
    private String curso;

    public Turma(String codigo, String curso) {
        this.codigo = codigo;
        this.curso = curso;
    }

    public void exibirTurma() {
        System.out.println("Turma: " + codigo + " - Curso: " + curso);
    }
}


