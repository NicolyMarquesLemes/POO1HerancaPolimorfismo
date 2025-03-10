
package Herancapkg1;

public abstract class Veiculo {
    protected String marca;
    private String modelo;
    
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract void exibirDetalhes();
        
        public String getModelo(){
            return modelo;
        }
        
    }

