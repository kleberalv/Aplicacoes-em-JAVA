/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaun4tst3;
import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ClienteConta cc = new ClienteConta();
        ClientePoupanca cp = new ClientePoupanca();
        ClienteEspecial ce = new ClienteEspecial();
        
int escolha;
        
        System.out.println("Progama bancario");
        System.out.println("\nPara cliente especial: 1"+
                            "\nPara cliente poupança: 2");
       escolha= sc.nextInt();
       System.out.println();
       
       switch (escolha){
             
           case 1:
             System.out.println("\nVocê é um cliente especial!!");
             System.out.println();
             
             System.out.println("Digite seu nome e pressione ENTER: ");
             ce.setNome(sc.next());
             System.out.println("Digite o número de sua conta: ");
             ce.setConta(sc.next());
             System.out.println("Digite o seu saldo e pressione ENTER: ");
             ce.setSaldo(sc.nextDouble());
             System.out.println("Informe o reajuste da conta especial e pressione ENTER: ");
             ce.setLimite(sc.nextDouble());
             
             System.out.println("INFORMAÇÕES DA CONTA: ");
             System.out.println(ce.toString());       
           break;
            case 2:
              System.out.println("Você é um cliente poupança!!");
              System.out.println();
              
              System.out.println("Digite seu nome e pressione ENTER: ");
              cp.setNome(sc.next());
              System.out.println("Digite o número de sua conta: ");
              cp.setConta(sc.next());
              System.out.println("Digite o seu saldo e pressione ENTER: ");
              cp.setSaldo(sc.nextDouble());
              System.out.println("Informe a taxa de juros da poupança: ");
              cp.setTaxajuros(sc.nextInt());
                           
              System.out.println("INFORMAÇÕES DA CONTA: ");  
              System.out.println(cp.toString());
           break;
            default:
                System.out.println("Opção inválida!!!!");
            break;
}
    }
}

/**
 * RN1: O cliente pode abrir uma conta Especial ou Poupança e pode executar saques e/ou depósitos nestas contas;
 * RN2: O cliente Especial recebe um valor limite na sua conta, só podendo sacar até o valor do limite + saldo. 
 * Caso ele tente sacar um valor acima do limite+saldo , uma mensagem de 
 * “Saque não pode ser efetuado, valor acima do limite” deve ser mostrada. 
 */