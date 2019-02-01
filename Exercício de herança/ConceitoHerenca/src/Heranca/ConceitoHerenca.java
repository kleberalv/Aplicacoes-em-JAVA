package Heranca;
import java.util.Scanner;
public class ConceitoHerenca {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Empregado emp = new Empregado();

        System.out.println("1- Para ALUNO");
        System.out.println("2- Para EMPREGADO");
        int e;
        
        e=sc.nextInt();
        if (e==1){
            
        System.out.println("Você escolheu ALUNO");                 
        System.out.println("Entre com o seu nome: ");
        a.setNome(sc.next());
        System.out.println("Entre com a sua idade: ");
        a.setIdade(sc.nextInt());
        System.out.println("Entre com o codigo: ");
        a.setCodigo(sc.next());
        System.out.println("Digite seu curso: ");
        a.setCurso(sc.next());
        System.out.println(a.toString());
        
            }else
            
             if(e==2){
                System.out.println("Você escolheu EMPREGADO");                       
        System.out.println("Entre com o seu nome: ");
        emp.setNome(sc.next());
        System.out.println("Entre com a sua idade: ");
        emp.setIdade(sc.nextInt());
        System.out.println("Entre com o codigo: ");
        emp.setCodigo(sc.next());
        System.out.println("Informe seu salário: ");
        emp.setSalario(sc.nextDouble());
        System.out.println(emp.toString());
        
            }else
                System.out.println("Opção inválida!");

     
    }
    
}
