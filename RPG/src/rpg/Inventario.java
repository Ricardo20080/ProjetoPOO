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
public class Inventario {
    private Item item;

    public void adicionarItem(Item item) {
        this.item = item;
        System.out.println("Item adicionado ao inventário!");
    }

    public void exibirInventario() {
        if (item != null) {
            item.exibirItem();
        } else {
            System.out.println("Inventário vazio.");
        }
    }

}
