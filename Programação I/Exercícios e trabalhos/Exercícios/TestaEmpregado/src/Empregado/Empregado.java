package Empregado;
public abstract class Empregado {
    
    private String nome;
    private String cpf;
    private String data_nasc;
    private String conta;
    private String agencia;
    private Double salarioBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public Empregado(String nome, String cpf, String data_nasc, String conta, String agencia, Double salarioBase){
        this.nome=nome;
        this.cpf=cpf;
        this.data_nasc=data_nasc;
        this.conta=conta;
        this.agencia=agencia;
        this.salarioBase=salarioBase;
    }
    
    public abstract Double receberSalario();
    
    @Override
    public abstract String toString();
    
}
