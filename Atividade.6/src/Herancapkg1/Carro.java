
package Herancapkg1;

public class Carro extends Veiculo{
    private String portas;
    protected int ano;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public void definirDetalhes(int ano){
        if(ano < 1886){
            System.out.println("O ano está escrito errado!");
    }else{
    this.ano = ano;
        }
    }
    public void definirDetalhes(String portas){
        this.portas = portas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + getModelo());
        System.out.println("Portas: " + portas);
        System.out.println("Ano: " + ano);
    }
}
