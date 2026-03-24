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
public class Medico extends Pessoa {
    private String crm;
    private Especialidade especialidade;

    public Medico(String nome, int idade, String crm, Especialidade especialidade) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CRM: " + crm);
        if (especialidade != null) {
            especialidade.exibirEspecialidade();
        }
    }
}

