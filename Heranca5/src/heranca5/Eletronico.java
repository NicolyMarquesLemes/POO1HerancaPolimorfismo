
package heranca5;

public abstract class Eletronico {
    protected String marca;
    
    public Eletronico(String marca){
        this.marca = marca;
    }
    
    public abstract void ligar();
        
    }

