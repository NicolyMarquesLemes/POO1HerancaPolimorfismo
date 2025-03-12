
package heranca4;

public class contaCorrente extends Conta {
    private double limite;

    public contaCorrente(double saldo) {
        super(saldo);
    }
    
    public void definirLimite(double limite){
        this.limite = limite;
    }
    
    public void exibir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }

    @Override
    public void calcularJuros() {
       saldo *= 0.02;
    }
}
