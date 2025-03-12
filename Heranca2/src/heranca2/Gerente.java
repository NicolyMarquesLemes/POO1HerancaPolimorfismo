
package heranca2;

public class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salario){
        super(nome);
        this.salario = salario;
    }
    
    public void definirBonus(double bonus){
        this.bonus = bonus;
    }
    
    public void definirBonus(int bonus){
        this.bonus = bonus;
    }
    
    @Override
    public void calcularSalario(){
        System.out.println("Nome: " + nome);
        salario += bonus ;
         System.out.println("Salario: " + salario);
    }
}

