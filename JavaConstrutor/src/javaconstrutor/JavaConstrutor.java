/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaconstrutor;
import java.util.Scanner;
import java.text.DecimalFormat;
public class JavaConstrutor {
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
      Conta c1=new Conta(0," ",0.0);    
      Conta c2=new Conta(0," "); 
        System.out.println("Digite o número e pressione ENTER: ");
        c1.setNumero(sc.nextInt());
        c2.setNumero(sc.nextInt());
        
        System.out.println("Digite o nome e pressione ENTER: ");
        c1.setNome(sc.next());
        c2.setNome(sc.next());
        
        System.out.println("Digite o saldo e pressione ENTER: ");
        c1.setSaldo(sc.nextDouble());
        c2.setSaldo(sc.nextDouble());
        
        System.out.println();
        System.out.println("********** CLIENTES VIP ********** ");
        System.out.println();
        System.out.println("Número: "+c1.getNumero());
        System.out.println("Nome: "+c1.getNome());
        System.out.println("Saldo: "+c1.getSaldo());
        
        System.out.println();
        System.out.println("********** CLIENTES COMUM ********** ");
        System.out.println();
        System.out.println("Número: "+c2.getNumero());
        System.out.println("Nome: "+c2.getNome());
        System.out.println("Saldo: "+c2.getSaldo());
    }
    
}
