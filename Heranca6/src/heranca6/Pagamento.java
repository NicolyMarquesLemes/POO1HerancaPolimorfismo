
package heranca6;

public abstract class Pagamento {
    protected double valor;
    
    public Pagamento(double valor){
        this.valor = valor;
    }
    
    public abstract void processarPagamento();
}
