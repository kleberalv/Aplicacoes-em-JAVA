package Exercicio03;
public class Soma {
    
    float nota1=0,nota2=0,nota3=0;
    float peso1=0,peso2=0,peso3=0;
    
    float CalculaMedia(){
        
        return  ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) /CalculaPeso() ;
        
    }
    
    float CalculaPeso(){
        
     return (peso1 + peso2 + peso3);  
    }
}
