
package heranca4;

public class Heranca4 {

    public static void main(String[] args) {
        contaPoupanca conta1 = new contaPoupanca(678);
        conta1.calcularJuros();
        conta1.definirTaxa(45);
        conta1.exibir();
    }
    
}
