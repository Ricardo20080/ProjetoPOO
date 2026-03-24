/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedica;

/**
 *
 * @author maxvi
 */
public class Recepcionista extends Pessoa {
    private String turno;

    public Recepcionista(String nome, int idade, String turno) {
        super(nome, idade);
        this.turno = turno;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Turno: " + turno);
    }
}

