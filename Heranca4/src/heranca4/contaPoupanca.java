
package heranca4;

public class contaPoupanca extends Conta {
    private double taxaRendimento;
    
    public contaPoupanca(double saldo){
        super(saldo);
    }
    
    public void definirTaxa(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }
    public void definirTaxa(int taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }
    
    public void exibir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Taxa de Rendimento: " + taxaRendimento);
    }

    @Override
    public void calcularJuros() {
        saldo *= 0.02;
    }
    
    
}
