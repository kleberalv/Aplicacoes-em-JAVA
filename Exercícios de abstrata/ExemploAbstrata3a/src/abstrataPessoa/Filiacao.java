package abstrataPessoa;

public class Filiacao {
    
private String nomepai;
private String nomemae;

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public Filiacao(String nomepai, String nomemae){
        this.nomepai=nomepai;
        this.nomemae=nomemae;
        
    }
    
    public String toString(){
            return "\n Nome do pai: "+getNomepai()+
                    "\n Nome da mãe: "+getNomemae();
    }
  
}
