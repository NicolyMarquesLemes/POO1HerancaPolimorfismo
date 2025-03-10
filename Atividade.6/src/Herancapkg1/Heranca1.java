
package Herancapkg1;

public class Heranca1 {

    public static void main(String[] args) {
        Carro veiculo1 = new Carro("Fiat", "Fiat Argo");
        veiculo1.definirDetalhes("quatro portas");
        veiculo1.definirDetalhes(2025);
        veiculo1.exibirDetalhes();
        
        Moto veiculo2 = new Moto("Suzuki", "Hayabusa");
        veiculo2.definirDetalhes(67);
        veiculo2.exibirDetalhes();
    }
    
}
