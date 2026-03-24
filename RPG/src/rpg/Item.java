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
public class Item {
    private String nome;
    private String efeito;

    public Item(String nome, String efeito) {
        this.nome = nome;
        this.efeito = efeito;
    }

    public void exibirItem() {
        System.out.println("Item: " + nome + " - Efeito: " + efeito);
    }
}


