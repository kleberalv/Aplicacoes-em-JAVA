package Heranca;

public class Pessoa {
 
private String codigo;
private String nome;
private int idade;

    public String getCodigo() {
        return codigo;
    }
    
    public int MostrarIdade(){
     int idadee= this.idade;
     return idadee;   
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    }
    
