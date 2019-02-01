package herancaProduto;

public class TestaHeranca {

    public static void main(String[] args) {
        CarneFrango cf = new CarneFrango("147258369", "Picanha", 45.00, "31/08/2018", 1.0);
        Geladeira g = new Geladeira("369852147", "Refrigerador Eletrolucs", 3500.00, "Eletrolux", 380);
        SaboneteLiquido sb = new SaboneteLiquido("789465321", "Sabonete Monange", 1.99, 56, "Peles Secas");
        
        System.out.println(cf);
        System.out.println(g);
        System.out.println(sb);
        
        
        
    }
    
}
