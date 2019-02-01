package Servicos;
import java.text.DecimalFormat;
import InterfaceOperador.AdmLoterica;

public class ClientePoupanca extends AdmLoterica {
    /** Extends quer dizer que a classe ClientePoupança e filha da classe AdmLoterica. 
     */
DecimalFormat df = new DecimalFormat("0.00");
   
private float taxajuros;   
/** Atributo da classe. */

    public float getTaxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(float taxajuros) {
        this.taxajuros = taxajuros/100;
    }


    /** Metodo especifico desta classe. */
    public double CorrigePoupanca(){
    double p;
    p= this.getSaldo()+(this.getSaldo()*this.getTaxajuros());
  
return p;  
    }
    

/** O saque efeuta o calculo do salado menos o saque e depois o subtrai esse 
 * valor novamente ao saldo para obter o valor do saque. */    
public double Saque(){
/** Variavel local para guardar o resultado da conta. */
double s;

/** Calculo para mostrar apenas o valor do saque efetuado sobre a saldo mais 
 * a taxa de juros.
 */
    if (this.CorrigePoupanca()>=this.getSacar()){
  s= (this.CorrigePoupanca()) - (this.CorrigePoupanca() - this.getSacar());
  return s;      
    }else
        /** Caso o usuario tente sacar mais do que ele tem. */
        System.out.println("SALDO INSUFICIENTE PARA EFETUAR O SAQUE!");
    return 0;
        }
/** Este metodo faz o calculo para corrigir o saldo depois de um saque. */
public double CorrigeSaldo(){
/** Variavel local para guardar o valor de outro calculo. */
double rs;

    rs=(this.CorrigePoupanca()-this.Saque());
return rs;    
}


/** Sasaldo é um metodo criado para simular uma conta que ja possui saldo 
 * maior que zero sem a necessidade de receber um valor informado pelo o
 * usuario.
 */
public void Sasaldo(){
/** A variavel local guarda o valor desse saldo. */  
double contaficticia;

    contaficticia= this.getSaldo()+150.35;
    System.out.println("Saldo: "+contaficticia);
}

/** Nesse toString tem o retorno de todos os dados após a finalização 
 * da opção escolhida pelo o usuario. 
 */
    @Override
    public String toString() {
        return  "\nNome: "+this.getNome()+
                "\nNúmero da conta: "+this.getConta()+
                "\nSaldo: "+this.getSaldo()+
                "\nTaxa de juros: "+this.taxajuros+
                "\nSaldo corrigido pelo percentual de juros: "+df.format(CorrigePoupanca())+
                "\nValor sacado: "+df.format(Saque())+
                "\nSaldo atual: "+df.format(CorrigeSaldo());

    }

}
