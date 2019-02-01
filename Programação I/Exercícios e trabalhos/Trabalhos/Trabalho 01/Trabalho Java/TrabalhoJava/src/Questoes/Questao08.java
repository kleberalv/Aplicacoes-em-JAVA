package Questoes;
import java.util.Scanner;
public class Questao08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Variáveis        
int i,c,idade,sexo,contador=0, contador2 = 0, contador3 = 0, contador4 = 0, calculo=0 ;
int CordosOlhos=0,CordosCabelos=0,homem=0,mulher=0,verdes=0,castanhos=0,azuis=0;
int louros=0,castanhoss=0,pretos=0;

        System.out.println("Informe o número de habitantes pesquisados: ");  
        i=sc.nextInt();
        
        for(c=0; c<i; c++){
            System.out.println("Informe o Sexo. 1 para masculino e 2 para feminino.");
            sexo=sc.nextInt();
            
            switch (sexo){
                case 1:
                    System.out.println("Sexo masculino!");
                    homem=(homem+1);
                break;
                case 2:
                    System.out.println("Sexo feminino!");
                    mulher=(mulher+1);
                break;
                default:
                    System.out.println("Opção inválida!");
            }
                        
            System.out.println("Informe a cor dos olhos. 1 para azuis, 2 para verdes e 3 para castanhos.");
            CordosOlhos=sc.nextInt();
            
            
            switch (CordosOlhos){
                case 1:
                    System.out.println("Olhos azuis!");
                    azuis=(azuis+1);
                break;
                case 2:
                    System.out.println("Olhos verdes!");
                    verdes=(verdes+1);
                break;
                case 3:
                    System.out.println("Olhos castanhos!");
                    castanhos=(castanhos+1);
                break;
                
                default:
                    System.out.println("Opção inválida!");
            }            
            
            System.out.println("Informe a cor dos cabelos. 1 para louros, 2 para castanhos, 3 para pretos.");
            CordosCabelos=sc.nextInt();
                       
            switch (CordosCabelos){
                case 1:
                    System.out.println("Louros!");
                    louros=(louros+1);
                break;
                case 2:
                    System.out.println("Castanhos!");
                    castanhoss=(castanhoss+1);
                break;
                case 3:
                    System.out.println("Pretos!");
                    pretos=(pretos+1);
                break;
                
                default:
                    System.out.println("Opção inválida!");
            }  
            
            
            System.out.println("Informe a idade: ");
            idade=sc.nextInt();
                if (idade>=18 && idade<=35){
                    contador=(contador+1);
                    contador2=idade;
                if (sexo==2){
                    contador4=contador4+1;
                    
                    }                    
                }
                    if (idade>contador2){
                    contador2=contador2+contador3;
                    }       
        }
                calculo=(contador4*i)/100; 
    
        System.out.println("Maior idade digitada foi: "+contador3);
        System.out.println("Percentual de mulheres: "+calculo);
        
    }
    
}
