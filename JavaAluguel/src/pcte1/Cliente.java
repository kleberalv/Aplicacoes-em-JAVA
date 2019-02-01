package pcte1;


/**
 *
 * @author tregis
 */
public class Cliente {
private String nome,sexo;
private int idade;


public String getNome(){
    return nome;
}
public int getIdade(){
    return idade;
}
public void setNome(String nome){
    this.nome=nome;
}
public void setIdade(int idade){
    this.idade=idade;
}
public void sexo(int sexo){
    if (sexo==1){
        this.sexo="masculino";
    }else {
        this.sexo="feminino";
    }
}
public String toString(){
    return "Nome: "+nome+" Idade:"+idade+" Sexo: "+sexo;
}
}
