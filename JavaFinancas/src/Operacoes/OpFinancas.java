/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Operacoes;
import Calculadora.Calculadora;
import java.util.Scanner;
public class OpFinancas {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    Calculadora calculadora = new Calculadora(0.0,0);
    
        System.out.println("Bem-vindo a sua calculadora virtual simples.");
        System.out.println("Digite o primeiro valor e pressione ENTER: ");
        calculadora.setNum1(sc.nextInt());
        System.out.println("Digite o segundo valor e pressione ENTER: ");
        calculadora.setNum2(sc.nextDouble());
        
        System.out.println("Digite a opção desejada: ");
        System.out.println("1- Para soma entre os números");
        System.out.println("2- Para multiplicação entre os números");
        int op= sc.nextInt();

        System.out.println("----------RESULTADO----------");
        switch(op){
            case 1:
                System.out.println("Voce escolheu somar os números digitados");
                calculadora.toString(op);
                System.out.println("A soma dos números é igual a: "+calculadora.Soma());
            break;
            case 2:
                 System.out.println("Voce escolheu fazer o produto entre os números digitados");
                 calculadora.toString(op);
                 System.out.println("O produtodo entre os núemros é igual a: "+calculadora.Mult());
            break;
            default:
                System.out.println("Opção inválida!");
            
        }
    }
    
}
