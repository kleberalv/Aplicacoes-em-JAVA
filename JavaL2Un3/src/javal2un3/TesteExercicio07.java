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
public class TesteExercicio07 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    DecimalFormat df= new DecimalFormat("0.00");
    Exercicio07 soma= new Exercicio07();
        System.out.println("Digite o valor do Raio e pressione ENTER:  ");
        soma.raio= sc.nextFloat();
        
        System.out.println("A área dessa circuferência é de: "+df.format(soma.CalcularArea()));
        System.out.println("O comprimento dessa circuferência é de: "+df.format(soma.CalcularComprimento()));
    }
    
}
