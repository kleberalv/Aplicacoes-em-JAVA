package Figuras;
import java.text.DecimalFormat;
public class Quadrado extends FigurasDiagonal {

DecimalFormat df= new DecimalFormat("0.00");    
private int L1;


    public int getL1() {
        return L1;
    }

    public void setL1(int L1) {
        this.L1 = L1;
    }

    public int p(int L1,int L2){
     
     L1=L2;   
     return 4*L1;    
        
    }
    @Override
    public String toString() {
        return "Perímetro do quadrado: "+this.p(L1,L1)+"m"+
                "\nÁrea do quadrado: "+"m³"+
                "\nDiagona do quadrado: "+df.format(cdi())+"m" ;
    }  
    
}
