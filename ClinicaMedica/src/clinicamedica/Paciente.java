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
public class Paciente extends Pessoa {
    private String cpf;
    private String planoSaude;

    public Paciente(String nome, int idade, String cpf, String planoSaude) {
        super(nome, idade);
        this.cpf = cpf;
        this.planoSaude = planoSaude;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + cpf);
        System.out.println("Plano de Saúde: " + planoSaude);
    }
}

