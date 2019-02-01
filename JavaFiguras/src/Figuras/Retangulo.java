package Figuras;
import java.text.DecimalFormat;
public class Retangulo extends FigurasDiagonal {
    
DecimalFormat df= new DecimalFormat("0.00");
    
private int L1, L2;  

    public int getL1() {
        return L1;
    }

    public void setL1(int L1) {
        this.L1 = L1;
    }

    public int getL2() {
        return L2;
    }

    public void setL2(int L2) {
        this.L2 = L2;
    }

        public int P (int L1, int L2){
        
       return 2*(L1+L2);
    }
    
    @Override
    public String toString() {
        return "Perímetro do Retangulo: "+this.P(L1, L2)+"m"+
                "\nÁrea do retângulo: "+"m³"+
                "\nDiagonal do retângulo: "+df.format(cdi())+"m";
    }
   
       
}
