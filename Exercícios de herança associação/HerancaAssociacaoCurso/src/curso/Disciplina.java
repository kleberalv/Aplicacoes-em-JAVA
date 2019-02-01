package curso;

public class Disciplina {
    
private String codigo;
private String nome;
private Double cargaHoraria;

    public String getCodigo() {
        return codigo;
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

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(String codigo, String nome, Double cargaHoraria){

        this.codigo=codigo;
        this.nome=nome;
        this.cargaHoraria=cargaHoraria;
    }
    
    public String toString(){
        return  "\n--Dados disciplina--"+
                "\nCodigo: "+getCodigo()+
                "\nNome da disciplina: "+getNome()+
                "\nCarga horária: "+getCargaHoraria();
       
    }
    
}
