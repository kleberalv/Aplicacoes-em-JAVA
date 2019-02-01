package Pcte1;
public class Empregado {
    
public String nome;
private String dpto;
private double salario;
protected boolean situa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }
    
    public double bonifica (double v1){
        this.salario = (this.salario*(v1/100))+this.salario/100;
        return this.salario;
    }
    
    public String demite( boolean situa){
        this.situa = situa;
        String situ = null;
        
        if(situa == true){
            situ ="Funcionario ATIVO";
        }else{
            situ = "Funcionario DEMITIDO";
        }
        return situ;
    }
    
    public String toString(){
        
    return "\nNome : "+this.nome+
            "\nSituação: "+this.demite(situa)+
             "\nDepartamento: "+this.dpto+
               "\nSalario: "+this.salario+
                "\nNovo Salário: "+this.bonifica(salario);
   
    }
    
 }