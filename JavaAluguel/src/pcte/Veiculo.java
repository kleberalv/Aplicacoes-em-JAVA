/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcte;

/**
 *
 * @author tregis
 */
import java.text.DecimalFormat;
import pcte1.Cliente;

public class Veiculo {
private String modelo,placa;
private double diaria,valorAluguel;;
private int diasAlugado;
Cliente cli=new Cliente(); //declarando a variavel de vinculo(cli) entre as classes
DecimalFormat df = new DecimalFormat("R$ #,##0.00" );


public String getModelo(){
    return modelo;
}
public String getPlaca(){
    return placa;
}
public double getDiaria(){
    return diaria;
}
public double getDiasAl(int dias){
    return dias;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}
public void setPlaca(String placa){
    this.placa=placa;
}
public void setDiaria(double diaria){
    this.diaria=diaria;
}
public void setDiasAlug(int dias){
    diasAlugado=dias;
}
public double calAluguel(){
    valorAluguel=diaria*diasAlugado;
    return valorAluguel;
}
public String toString(){
    return "Modelo: "+modelo+" Placa:"+placa+" Dias:"+diasAlugado
            +" Diaria: "+df.format(diaria)+" Valor :"
            +df.format(valorAluguel)+"\n"+cli;
}

}
