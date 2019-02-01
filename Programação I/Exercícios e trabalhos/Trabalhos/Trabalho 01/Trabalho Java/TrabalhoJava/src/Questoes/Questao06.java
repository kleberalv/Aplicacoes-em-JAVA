package Questoes;
import java.util.Scanner;
public class Questao06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  int cc,formula,formula2,novovalor=0;   
  
  //Cliente 1: 
  int conta, saldo, itens,limite; 
  
        System.out.println("Programa Banco do Brasil");

        System.out.println("Digite o número de sua conta e pressione ENTER: ");
        conta=sc.nextInt();
        System.out.println("Digite seu saldo de início de mês: ");
        saldo=sc.nextInt();
        System.out.println("Informe o total de itens que foi comprado: ");
        itens=sc.nextInt();
        System.out.println("Digite o seu limite: ");
        limite=sc.nextInt();
        
        System.out.println("\nIndentificando sua conta...");
        System.out.println("Cliente da conta de número: "+conta);
        System.out.println("Seu saldo de início de mês é de: "+saldo);        
        System.out.println("Você compru um total de "+itens+" itens com o seu cartão.");
        System.out.println("Limíte de crédito autorizado: "+limite);
        
        formula=(saldo+itens-limite);
        
        if (formula>=0){
            novovalor=formula;
            
            System.out.println("\nLimíte de crédito não excedio!");
            System.out.println("Valor restante: "+novovalor);
            
        }else{
            
            novovalor=(formula*-1);
            System.out.println("\nLimíte de crédito excedido! ");
            System.out.println("O valor ultrapassado totalizou: R$"+novovalor);
        }
  
    }
    
}
