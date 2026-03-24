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
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 15); // chama o construtor da superclasse Personagem
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com espada!");
    }
}




