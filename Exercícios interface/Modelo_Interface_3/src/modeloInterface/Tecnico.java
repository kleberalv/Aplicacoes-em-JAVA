package modeloInterface;
public class Tecnico extends Pessoa{
    
    private String matr;
    private Double gratificacao;
    private Equipamento equipamento;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    public Tecnico(String matr, Double gratificacao, String cpf, String nome, Equipamento equipamento){
        super(cpf, nome);
        this.matr=matr;
        this.gratificacao=gratificacao;
        this.equipamento=equipamento;
    }
    
    public String toString(){
        return  "\n ---- Dados do técnico ----"+
                "\n CPF: "+getCpf()+
                "\n Nome: "+getNome()+
                "\n Matricula: "+getMatr()+
                "\n Gratificação: "+getGratificacao()+
                "\n "+getEquipamento();
    }

}
