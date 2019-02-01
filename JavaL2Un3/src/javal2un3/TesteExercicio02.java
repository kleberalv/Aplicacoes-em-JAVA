/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
public class TesteExercicio02 {

    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    Exercicio02 soma= new Exercicio02();
    
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1= sc.nextFloat();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n2= sc.nextFloat();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n3= sc.nextFloat();
        
        System.out.println("O número: "+soma.n1+ " Convertido para INT é: "+soma.Numero1());
        System.out.println("O número: "+soma.n2+ " Convertido para INT é: "+soma.Numero2());
        System.out.println("O número: "+soma.n3+ " Convertido para INT é: "+soma.Numero3());
    }
   // O número em Float digitado foi convertido para inteiro. 
}
