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
public class Consulta {
    
private Paciente paciente;
    private Medico medico;
    private String data;

    public Consulta(Paciente paciente, Medico medico, String data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public void exibirConsulta() {
        System.out.println("Consulta em " + data);
        System.out.println("--- Paciente ---");
        paciente.exibirDados();
        System.out.println("--- Médico ---");
        medico.exibirDados();
    }
}

