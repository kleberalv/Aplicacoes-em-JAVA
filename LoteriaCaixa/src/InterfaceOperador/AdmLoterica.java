package InterfaceOperador;
import java.text.DecimalFormat;
public class AdmLoterica {
    /** DecimalFormat é usado para a formatação. */
    DecimalFormat df = new DecimalFormat("0.00");
    
/** Atributos da classe mae que são herdados nas classses filhas. */    
private String nome;
private String conta;
private double Saldo;
private double sacar;
private int senha;
/* Get's e Set's. */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
 //___________________________________________________________________________\\     
/** Metodos herdados e usados como polimorfismo. */    
    public void Sasaldo(){
       
    }
    
    public double Saque(){
        return 0;
    }
    
    public double CorrigeSaldo(){
        return 0;
    }
    
      
}
