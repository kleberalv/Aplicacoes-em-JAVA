/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Pcte2;
import Pcte1.Veiculo;
import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Veiculo vei = new Veiculo();
    Motor moto= new Motor();
    
        System.out.println("Programa para veículos: ");
        System.out.println("Informe a marca: ");
        vei.setMarca(sc.next());
        System.out.println("Informe a cor do veículo: ");
        vei.setCor(sc.next());
        
        System.out.println("Você deseja pintar o veículo? para SIM tecle 1, para NÃO tecle 2.");
        int op= sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Você escolheu pintar o veículo. ");
                System.out.println("Qual cor você deseja? ");               
                vei.setCor(sc.next());
                System.out.println("A cor foi alterada.");
            break;
            case 2:
                 System.out.println("Você escolheu nao pintar o carro.");
            break;
            default:
                System.out.println("Opção inválida, a cor será mantida.");
        }
        
        System.out.println("Informe o tipo do motor: ");
        moto.setTipMotor(sc.next());
        System.out.println("Informe a potência do motor: ");
        moto.setPotencia(sc.nextFloat());
        System.out.println("Informe o valor dos acessórios: ");
        vei.setPrecoAcess(sc.nextDouble());
        System.out.println("Informe o preço do motor: ");
        moto.setPreMotor(sc.nextFloat());
        
        System.out.println(moto.toString());
        System.out.println(vei.toString());
    } 
  }
