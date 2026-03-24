
package projetopooexerc2;

public class Livro extends Material {
    private String genero;

    public Livro(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano);
        this.genero = genero;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Gênero: " + genero);
    }

    @Override
    public int prazoEmprestimo() {
        return 14;
    }
}