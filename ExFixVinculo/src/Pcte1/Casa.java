package Pcte1;
public class Casa {
    
    private int casa;
    protected String  cor;
    private double area;
    private double valug;
    protected boolean porta;
    public int op;

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValug() {
        return valug;
    }

    public void setValug(double valug) {
        this.valug = valug;
    }
    public void msgarea(){
        if (area>=2000)
            System.out.println("Lote Grande!");
        else 
            System.out.println("Lote Pequeno!");               
    }
    public String porta(){
        return "Porta Abrindo.";
    }
    public void alug(String tipo){
        if (tipo == "Praia")
            System.out.println("Aluguel no valor de: R$:2000");
        else if (tipo == "Campo")
             System.out.println("Aluguel no valor de: R$:1000");
        else 
            System.out.println("Aluguel no valor de: R$:800");         
        }
        public String toString(){
            return "";
    }
}
