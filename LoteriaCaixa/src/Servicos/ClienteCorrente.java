package Servicos;
import InterfaceOperador.AdmLoterica;
import java.text.DecimalFormat;

public class ClienteCorrente extends AdmLoterica {

DecimalFormat df = new DecimalFormat("0.00");

/** O saque efeuta o calculo do salado menos o saque e depois o subtrai esse 
 * valor novamente ao saldo para obter o valor do saque. */
public double Saque(){
/** Double s, é uma variavel local para armazenar o resultado do calculo. */
double s;

/** Calculo para mostrar apenas o valor do saque. */
    if (this.getSaldo()>=this.getSacar()){
  s= (this.getSaldo()) - (this.getSaldo() - this.getSacar());
  return s;      
    }else
        /** Caso o usuario tente sacar mais do que ele tem. */
        System.out.println("SALDO INSUFICIENTE PARA EFETUAR O SAQUE!");
    return 0;
        }


/** Sasaldo é um metodo criado para simular uma conta que ja possui saldo 
 * maior que zero sem a necessidade de receber um valor informado pelo o
 * usuario.
 */
public void Sasaldo(){
/** A variavel local guarda o valor desse saldo. */   
double contaficticia;

    contaficticia= this.getSaldo()+980.50;
    System.out.println("Saldo: "+contaficticia);
}
 
/** Este metodo faz o calculo para corrigir o saldo da conta corrente 
 * depois de um saque. 
 */
public double CorrigeSaldo(){
/** Varavel do corrige saldo para o calculo. */
double rs;

    rs= (this.getSaldo()-this.Saque());
return rs;    
}

/** Nesse toString tem o retorno de todos os dados após a finalização 
 * da opção escolhida pelo o usuario. 
 */
    @Override
    public String toString() {
        return  "\nNome: "+this.getNome()+
                "\nNúmero da conta: "+this.getConta()+
                "\nSaldo: "+this.getSaldo()+
                "\nValor sacado: "+df.format(Saque())+
                "\nSaldo atual: "+df.format(CorrigeSaldo());
    }   
}
