
package projetopooexerc2;

public class TCC extends Material {
    private String curso;

    public TCC(String titulo, String autor, int ano, String curso) {
        super(titulo, autor, ano);
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }

    @Override
    public int prazoEmprestimo() {
        return 10;
    }
}