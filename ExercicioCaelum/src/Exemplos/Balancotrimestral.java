package Exemplos;

class Balancotrimestral {
    
public static void main(String[] args) {
    
// declarar os gastos nos meses. 
int Janeiro;
int Fevereiro;
int Marco;
Janeiro = 15000;
Fevereiro = 23000;
Marco = 17000;

int gastosTrimestre = Janeiro + Fevereiro + Marco;
int gastomedio = gastosTrimestre/3 ;

// imprimir os gastos

System.out.println("Os gastos do trimestre foram de: "+gastosTrimestre);
    System.out.println("Os gastos em média foram de: "+gastomedio);
}
}