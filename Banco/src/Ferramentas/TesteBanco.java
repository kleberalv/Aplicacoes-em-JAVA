/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Ferramentas;
import java.util.Scanner;
import ContaPoupança.Conta;

public class TesteBanco {
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      Conta conta = new Conta(0,0.0);
        System.out.println("Digite o seu nome e pressione ENTER: ");
          conta.setNome(sc.nextLine());
        System.out.println("Digite o numero da conta e pressione ENTER: ");
          conta.setNumero(sc.nextInt());
        System.out.println("Digite o saldo da conta e pressione ENTER: ");
          conta.setSaldo(sc.nextDouble());
        System.out.println("Digite a taxa da poupança e pressione ENTER: ");
          double tx=(sc.nextDouble());
          System.out.println("");
        System.out.println("****************************");
        
        System.out.println("Cliente: "+conta.getNome());
        System.out.println("Seu saldo inicial foi de: "+conta.getSaldo());
        System.out.println("Sua conta gerou um lucro de: "+conta.ReajustaPoup(tx));
        
    }
    
}
