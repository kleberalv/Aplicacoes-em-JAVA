package aula03;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Fazer um programa que faz as 4 oper~ções básicas e verifica se o resultado
    //da ultima operação é um número par ou impar.

        //Declaração de variáveis:
        double soma, sub, multi, div, n1,n2;

        //Início do programa:
        System.out.println("Calculadora");
        System.out.println("\nEntre com o primeiro número: ");
        n1=sc.nextDouble();
        System.out.println("\nEntre com o segundo número: ");
        n2=sc.nextDouble();

       //Valores para as variáveis:
        soma=n1+n2;
        sub=n1=n2;
        multi=n1*n2;
        div=n1/n2;

        //Resultado dos calculos:
        System.out.println("Resultado da soma: "+soma);
        System.out.println("Resultado da subtração: "+sub);
        System.out.println("Resultado da multiplicação: "+multi);
        System.out.println("Resultado da divisão: "+div);

        //
        if (div%2==0){
            System.out.println("\nO número: "+div+" é par");
        }else
            System.out.println("\nO número: "+div+" é impar");



    }

}
