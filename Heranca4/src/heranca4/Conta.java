
package heranca4;

public abstract class Conta {
    protected double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public abstract void calcularJuros();
}
