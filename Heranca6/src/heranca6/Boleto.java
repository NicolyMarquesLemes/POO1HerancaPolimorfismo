
package heranca6;

public class Boleto extends Pagamento{
    private String codigoBarras;
    private double valorBoleto;

    public Boleto(double valor, double valorBoleto) {
        super(valor);
        this.valorBoleto = valorBoleto;
    }
    
    
    public void definirCodigo(String codigo){
        this.codigoBarras = codigo;
        
    }
    
    public void exibir(){
        System.out.println("Valor do Boleto: " + valorBoleto);
        System.out.println("Valor pago: " + valor);
    }

    @Override
    public void processarPagamento() {
       if(valor == valorBoleto) {
           System.out.println("O pagamento foi concluído");
       }else if(valor < valorBoleto){
           System.out.println("O valor não é suficiente para o pagamento do boleto");
       }else{
           System.out.println("O valor do pagamento é maior que o boleto");
    }
}
    
}
