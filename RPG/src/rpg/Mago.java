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
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 25);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma bola de fogo!");
    }
}

