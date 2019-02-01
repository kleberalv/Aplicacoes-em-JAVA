package banco;

public class Endereco {
    
    private String rua;
    private int numero;
    private CEP Cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    public CEP getCep() {
        return Cep;
    }

    public void setCep(CEP Cep) {
        this.Cep = Cep;
    }    
    
    public Endereco(String rua, int numero, CEP Cep){
        this.rua=rua;
        this.numero=numero;
        this.Cep=Cep;
    }
    
    @Override
    public String toString(){
        return  "\n ---- Dados do Endereço ----"+
                "\n Rua: "+getRua()+
                "\n Número: "+getNumero()+
                "\n "+getCep();
    }
    
}
