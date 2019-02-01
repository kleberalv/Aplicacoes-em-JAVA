/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
public class TesteExercicio05 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    Exercicio05 soma= new Exercicio05();
    
        System.out.println("Esse programa vai receber o valor em segundos e transformar em horas, minutos e segundos.");
        System.out.println("Digite os segundos e pressione ENTER: ");
        soma.segundos = sc.nextInt();
        
        System.out.println(soma.segundos+" Segundos digitados equivalem a: "+soma.Minutos()+" Minutos.");
        System.out.println(soma.segundos+" Segundos digitados equivalem a: "+soma.Horas()+" Horas.");
        System.out.println("");
    }
    
}
