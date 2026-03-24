/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author maxvi
 */
public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " dispara uma flecha!");
    }
}
