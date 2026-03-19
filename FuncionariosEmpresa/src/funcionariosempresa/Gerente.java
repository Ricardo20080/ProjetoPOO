
package funcionariosempresa;

/**
 *
 * @author maxvi
 */
public class Gerente extends Funcionario {
    private String departamento;
    private int nivelSupervisao;
    private double bonus;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNivelSupervisao() {
        return nivelSupervisao;
    }
    public void setNivelSupervisao(int nivelSupervisao) {
        this.nivelSupervisao = nivelSupervisao;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

