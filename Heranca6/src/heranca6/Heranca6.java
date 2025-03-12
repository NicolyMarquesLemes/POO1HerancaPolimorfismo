
package heranca6;

public class Heranca6 {

    public static void main(String[] args) {
        cartaoCredito pagamento1 = new cartaoCredito(1000);
        pagamento1.definirLimite(500);
        pagamento1.processarPagamento();
        pagamento1.exibir();
        
        Boleto pagamento2 = new Boleto(400, 900);
        pagamento2.definirCodigo("hdfgjhgf");
        pagamento2.processarPagamento();
        pagamento2.exibir();
    }
    
}
