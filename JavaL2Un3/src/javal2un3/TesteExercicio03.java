/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
public class TesteExercicio03 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
      Exercicio03 soma= new Exercicio03();
      
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1= sc.nextInt();
    
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n2= sc.nextFloat();
        
        System.out.println("A soma dos número é igual a: "+soma.Resultado());
        // A soma do número em inteiro e o outro que é do tipo float gera um numero real. 
    }   
}
