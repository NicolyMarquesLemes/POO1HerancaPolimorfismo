
package heranca2;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public abstract void calcularSalario();
        
        
 
}
