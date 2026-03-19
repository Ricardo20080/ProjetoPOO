
package main;


public class Caminhao extends Veiculo{
    private double capacidadeDeCarga;
    private int numEixos;
    private String tipoCombustivel;
    
    public double getCapacidadeDeCarga(){
        return capacidadeDeCarga;
    }
    public void setCapacidadeDeCarga(double capacidadeDeCarga){
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    public int getNumEixos(){
        return numEixos;
    }
    public void setNumEixos(int numEixos){
        this.numEixos = numEixos;
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

}
