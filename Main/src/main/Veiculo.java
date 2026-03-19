
package main;


public class Veiculo {
    private String marca;
    private String modelo;
    private double valorDiaria;
    
    
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getValorDiaria(){
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }
    public double calcularDiaria(){
        return valorDiaria;
    }
    public void exibirDetalhes(){
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("valor diária: R$"+valorDiaria);
    }

}
