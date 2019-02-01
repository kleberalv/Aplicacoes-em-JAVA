/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

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
    private String cidade;
    private String dataNascimento;
    private String cpf;
    private String corDosOlhos;
    private String corDosCabelos;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getCorDosCabelos() {
        return corDosCabelos;
    }

    public void setCorDosCabelos(String corDosCabelos) {
        this.corDosCabelos = corDosCabelos;
    }

    public Pessoa(String nome, int idade, String sexo, String estado, String cidade, String dataNascimento, String cpf, String corDosOlhos, String corDosCabelos) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estado = estado;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.corDosOlhos = corDosOlhos;
        this.corDosCabelos = corDosCabelos;
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
