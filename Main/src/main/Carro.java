
package main;


public class Carro extends Veiculo{
    private int numeroPortas;
    private String tipoCambio;
    private int numeroAssentos;
    
    public int getNumeroPortas(){
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }
    public String getTipoCambio(){
        return tipoCambio;
        
    }
    public void setTipoCambio(String tipoCambio){
        this.tipoCambio = tipoCambio;
    }
    public int getNumeroAssentos(){
        return numeroAssentos;
    }
    public void setNumeroAssentos(int numeroAssentos){
        this.numeroAssentos = numeroAssentos;
    }

}
