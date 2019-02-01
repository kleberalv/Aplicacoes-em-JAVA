package javaun3l3;
import java.text.DecimalFormat;
public class Exercicio02 {    
    
    DecimalFormat df= new DecimalFormat("0.00");
 
float salario,bonus;    
    
void novoSalario(){
 
    if (salario>=1000){
        bonus= (salario)+100;
        System.out.println("Seu salario: "+salario+" Teve um bonus de 100 reais.");
        System.out.println("Seu salário ficou: "+df.format(+bonus));
    }else
        if (salario<1000){
            bonus=(salario)+50;
            System.out.println("Seu salario: "+salario+" Teve um bonus de 50 reais.");
            System.out.println("Sey salário ficou: "+df.format(+bonus));
        }
    
    
}    
    
    
}
