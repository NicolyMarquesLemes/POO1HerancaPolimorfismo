
package heranca7;

public abstract class Personagem {
    protected double energia;
    
    public Personagem(double energia){
        this.energia = energia;
    }
    
    public abstract void atacar();
        
    }

