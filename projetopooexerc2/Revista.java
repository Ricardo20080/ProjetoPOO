
package projetopooexerc2;

public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, String autor, int ano, int edicao) {
        super(titulo, autor, ano);
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Edição: " + edicao);
    }

    @Override
    public int prazoEmprestimo() {
        return 5;
    }
}