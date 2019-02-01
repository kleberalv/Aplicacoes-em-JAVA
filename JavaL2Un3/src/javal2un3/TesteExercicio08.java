/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
public class TesteExercicio08 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Exercicio08 soma= new Exercicio08();
        
        System.out.println("Programa para calcular a formula: ax²+ bx + c");
        System.out.println("Entre com os valores: ");
        System.out.print("A= ");
        soma.a= sc.nextInt();
        System.out.print("B= ");
        soma.b= sc.nextInt();
        System.out.print("C= ");
        soma.c= sc.nextInt();
        
        System.out.println(""+soma.a+"x²+"+soma.b+"x+"+soma.c);
        System.out.println("");
        System.out.println("Raiz de: "+soma.Formula()+" é igual a: "+soma.Raiz());
        
        System.out.println("X'= "+soma.x1());
        System.out.println("X''= "+soma.x2());
    }
    
}
