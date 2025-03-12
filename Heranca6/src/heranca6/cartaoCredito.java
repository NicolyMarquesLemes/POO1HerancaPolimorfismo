
package heranca6;

public class cartaoCredito extends Pagamento {
    private double limite;
    
    public cartaoCredito(double valor){
        super(valor);
    }
    
    public void definirLimite(double limite){
        this.limite = limite;
    }
    public void definirLimite(int limite){
        this.limite = limite;
    }
    
    public void exibir(){
        System.out.println("Valor: " + valor);
        System.out.println("Limite: " + limite);
    }

    @Override
    public void processarPagamento() {
        if(valor > limite){
            System.out.println("O pagamento passa o limite do cartão");
        }else{
            System.out.println("O pagamento foi concluído");
        }
    }
}
