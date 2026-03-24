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
public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    
    public Personagem (String nome, int vida, int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        
        
    }
    public String getNome(){
        return nome;
    }
    public int getVida(){
        return vida;
    }
    public int getAtaque(){
        return ataque;
    }
    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;

}
    public abstract void atacar();

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);

}
}

    


