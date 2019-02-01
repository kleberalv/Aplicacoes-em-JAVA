package animal;

public class Profissao {
    
 private String nome;
 private Double mediaSalarial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMediaSalarial() {
        return mediaSalarial;
    }

    public void setMediaSalarial(Double mediaSalarial) {
        this.mediaSalarial = mediaSalarial;
    }
 
    public Profissao(String nome, Double mediaSalarial){
      this.nome=nome;
      this.mediaSalarial=mediaSalarial;
     
    }
    
    public String toString(){
        return  "\nNome da profissão: "+getNome()+
                "\nSalario: "+getMediaSalarial();
    }
    
}
