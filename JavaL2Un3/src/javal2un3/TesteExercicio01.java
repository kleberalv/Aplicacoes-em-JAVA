/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
public class TesteExercicio01 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
        
        Exercicio01 soma= new Exercicio01 ();
        
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1= sc.nextInt();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n2= sc.nextInt();
         System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n3= sc.nextInt();
        
        System.out.println("O número: "+soma.n1+ " Convertido para FLOAT é: "+soma.Numero1());
        System.out.println("O número: "+soma.n2+ " Convertido para FLOAT é: "+soma.Numero2());
        System.out.println("O número: "+soma.n3+ " Convertido para FLOAT é: "+soma.Numero3());
    }
    //O número inteiro digitado foi convertido para Float.
}
