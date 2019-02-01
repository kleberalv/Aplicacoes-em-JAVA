package javaun3l3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio07 {
    
Scanner sc=new Scanner(System.in);
DecimalFormat df= new DecimalFormat("0.00");

    float i,nota,notas,media;
    int contador;
        
        void CalculoNota(){
           while (i<=12){
            contador= contador+1;
            System.out.println("Digite a nota do aluno numero: "+contador+" e pressione ENTER: ");
            nota=sc.nextFloat();
            notas= notas+nota;
i++;
            media= notas/13 ;
        }
            System.out.println("");
            System.out.println("A média da turma é de: "+df.format(media));            
        }
}