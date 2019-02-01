package Servicos;
public class Jogos {
    
    
/** Atributos da classe para os jogos.*/
private int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15;


/* Get's e Set's. */
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }

        public int getN6() {
            
        return n6;
    }

    public void setN6(int n6) {
        this.n6 = n6;
    }

    public int getN7() {
        return n7;
    }

    public void setN7(int n7) {
        this.n7 = n7;
    }

    public int getN8() {
        return n8;
    }

    public void setN8(int n8) {
        this.n8 = n8;
    }

    public int getN9() {
        return n9;
    }

    public void setN9(int n9) {
        this.n9 = n9;
    }

    public int getN10() {
        return n10;
    }

    public void setN10(int n10) {
        this.n10 = n10;
    }

    public int getN11() {
        return n11;
    }

    public void setN11(int n11) {
        this.n11 = n11;
    }

    public int getN12() {
        return n12;
    }

    public void setN12(int n12) {
        this.n12 = n12;
    }

    public int getN13() {
        return n13;
    }

    public void setN13(int n13) {
        this.n13 = n13;
    }

    public int getN14() {
        return n14;
    }

    public void setN14(int n14) {
        this.n14 = n14;
    }

    public int getN15() {
        return n15;
    }

    public void setN15(int n15) {
        this.n15 = n15;
    }

    /** Metodo quina foi criado porque recebe apenas 5 numeros. */
    public void Quina() {
        System.out.println("\nNúmeros apostados: "+
                            " "+this.n1+
                            " "+this.n2+
                            " "+this.n3+
                            " "+this.n4+
                            " "+this.n5);

    }
    
    
    /** Metodo Loto Facil foi criado porque recebe 15 numeros. */
    public void LotoFacil(){
        System.out.println("\nNÚMEROS APOSTADOS: "+
                            " "+this.n1+
                            " "+this.n2+
                            " "+this.n3+
                            " "+this.n4+
                            " "+this.n5+
                            " "+this.n6+
                            " "+this.n7+
                            " "+this.n8+
                            " "+this.n9+
                            " "+this.n10+
                            " "+this.n11+
                            " "+this.n12+
                            " "+this.n13+
                            " "+this.n14+
                            " "+this.n15);  
        
    }
/** Foi feito um toString para mostrar o resultado dos jogos Megasena e Duplasena. */
    @Override
    public String toString() {
        return "\nNÚMEROS APOSTADOS: "+
                " "+this.n1+
                " "+this.n2+
                " "+this.n3+
                " "+this.n4+
                " "+this.n5+
                " "+this.n6;

    } 
}
