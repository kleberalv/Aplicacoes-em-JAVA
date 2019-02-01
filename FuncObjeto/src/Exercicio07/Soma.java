package Exercicio07;
public class Soma {
    
    float salario=0, gratificacao=0, imposto=0, novoSalario=0;
    
    float SomaGratificacao(){
        
        return gratificacao= salario+50;
    }
    
    float SomaImposto(){
        
        return imposto=(float) (salario*0.10);
    }
    
    float SomaNovoSalario(){
        
        return novoSalario=salario-imposto;
    }
}