package modeloInterface;
public class Internet extends Servico implements HoraExtra{
    
    private Double valorHora;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public Internet(Double valorHora, String nome){
        super(nome);
        this.valorHora=valorHora;       
    }
    
    @Override
    public Double totalPagar(){
        return (valorHora*qtdHoraExtra);
    }
    
    @Override
    public String toString(){
        return  "\n  ---- Dados Internet ----"+
                "\n Valor da hora: "+getValorHora()+
                "\n Nome: "+getNome()+
                "\n Total a pagar: "+totalPagar();
    }
    
    
}
