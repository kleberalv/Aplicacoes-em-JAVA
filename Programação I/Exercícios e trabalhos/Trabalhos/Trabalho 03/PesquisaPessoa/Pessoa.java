/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author skynote
 */
public class Pessoa 
{
    private String nome;
    private int idade;
    private String sexo;
    private String estado;

    public Pessoa(String nome, int idade, String sexo, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estado = estado;
    }
    
     public Pessoa() {
        
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
