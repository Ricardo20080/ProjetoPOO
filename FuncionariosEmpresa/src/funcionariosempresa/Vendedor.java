
package funcionariosempresa;

/**
 *
 * @author maxvi
 */
public class Vendedor extends Funcionario {
    private double comissao;
    private double totalVendas;
    private double metaMensal;

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getMetaMensal() {
        return metaMensal;
    }
    public void setMetaMensal(double metaMensal) {
        this.metaMensal = metaMensal;
    }
}
