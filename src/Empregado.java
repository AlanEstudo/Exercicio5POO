
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Empregado {

    private String nome;
    private String sobreNome;
    private float salarioMensal;

    public Empregado(String nome, String sobreNome, float salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public float getSalarioMensal() {

        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        
        this.salarioMensal = salarioMensal;
    }
    
    public float salario(){
        if(salarioMensal < 0 ){
           salarioMensal = 0.00f; 
        }
        return salarioMensal;
    }
}
