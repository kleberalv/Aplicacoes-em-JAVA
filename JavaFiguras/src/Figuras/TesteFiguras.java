/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Figuras;
import java.util.Scanner;

public class TesteFiguras {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Quadrado qua = new Quadrado();
        Retangulo re = new Retangulo();
        TrianguloEquil tri= new TrianguloEquil();
        Figuras fig = new Figuras();
        
        System.out.println("Digite a base do retângulo e pressione ENTER: ");
        re.setL1(sc.nextInt());
        System.out.println("Digite o comprimento do retângulo e pressione ENTER: ");
        re.setL2(sc.nextInt());      
        System.out.println();
        
        System.out.println("Digite os lados do triangulo equilátero e pressionte ENTER: ");
        tri.setL1(sc.nextInt());
        System.out.println("Digite a altura do triangulo equilátero e pressione ENTER: ");
        tri.setH(sc.nextInt()); 
        System.out.println();
        
        System.out.println("Digite os lados do quadrado e pressione ENTER: ");
        qua.setL1(sc.nextInt());
        


    System.out.println("______________________________");
System.out.println(fig.toString());        
System.out.println(qua);
    System.out.println("______________________________");
System.out.println(re);
    System.out.println("______________________________");
System.out.println(tri);
    System.out.println("______________________________");
    }
    
}
