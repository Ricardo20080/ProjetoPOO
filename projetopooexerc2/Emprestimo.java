
package projetopooexerc2;

public class Emprestimo {
    private Usuario usuario;
    private Material material;

    public Emprestimo(Usuario usuario, Material material) {
        this.usuario = usuario;
        this.material = material;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== Empréstimo ===");
        usuario.exibirInformacoes();
        material.exibirInformacoes();
        System.out.println("Prazo: " + material.prazoEmprestimo() + " dias");
    }
}