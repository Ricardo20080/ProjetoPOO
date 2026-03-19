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
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    // Polimorfismo: será sobrescrito nas subclasses
    public void exibirPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

}
}
