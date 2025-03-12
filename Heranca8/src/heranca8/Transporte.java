
package heranca8;

public abstract class Transporte {
   protected double capacidade;
    
    public Transporte(double capacidade){
        this.capacidade = capacidade;
    }
    
    public abstract void mover();
        
    }
