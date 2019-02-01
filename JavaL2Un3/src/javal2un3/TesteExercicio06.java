/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TesteExercicio06 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    DecimalFormat df= new DecimalFormat("0.00");
    Exercicio06 soma= new Exercicio06();
    
        System.out.println("Digite a Altura e pressione ENTER: ");
        soma.altura= sc.nextInt(); 
        
        System.out.println("Digite a Base e pressione ENTER: ");
        soma.base= sc.nextInt();  
        
        System.out.println("Retângulo de valores: ");
        System.out.println("Perímetro: "+df.format(soma.Perimetro()));
        System.out.println("Área: " +df.format(soma.Area()));
        System.out.println("Diagonal: "+df.format(soma.Diagonal()));
        
        
    }    
}
