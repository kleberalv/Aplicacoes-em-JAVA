package pcte1;
import java.util.Scanner;
//import java.text.DecimalFormat;
public class Veiculo {
    Scanner sc= new Scanner (System.in);
    TesteVeiculo le= new TesteVeiculo(); 
 //   DecimalFormat df= new DecimalFormat("0.00");
    
private String modelo;  //Negativo (-)
protected String placa; //Hastag (#)
public int ano;         //Positivo(+)
private double valor;   //Negativo (-)
double n1;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



 void IPVA(){

if (2018 - ano >=15){
    System.out.println("ATENÇÃO: Seu veículo está isento de IPVA! ");
}else{
    System.out.println("ATENÇÃO: Seu veículo NÃO esta isento de IPVA!"); 
    System.out.println("Entre com a porcentagem e pressione enter: ");
    System.out.println("O valor do IPVA a ser pago é:  "
+CalcIPVA(sc.nextDouble()));
}    
    
    
}

double CalcIPVA(double IPVA){
     
return n1=(valor*IPVA/100);   
    
    
}













}
