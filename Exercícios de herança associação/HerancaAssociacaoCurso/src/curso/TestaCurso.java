package curso;

public class TestaCurso {

    public static void main(String[] args) {

    DeInformatica inf = new DeInformatica(147258369, "Informática", 
                          new Aluno("201702068048", "Kleber", 
                            new Professor("1689574320", "Elidones")), 
                              new Disciplina("15987654", "Lógica de programação", 2000.0), 360);    
    
    DeEletronica ele = new DeEletronica(1418595156, "Eletrônica", 
                         new Aluno("20145023887", "Marcos", new Professor ("549421564", "Marcelo")), 
                           new Disciplina("142536987", "Introdução à circuitos", 4096.0), 450, 
                             new Coordenador("Cristiano", "Recanto das emas"));
    
    DeTelecom tele = new DeTelecom(412575836, "Telecomunicaçãp",
                       new Aluno("201756369874", "Isadora", 
                         new Professor("158799358", "Maria")), 
                           new Disciplina("7878976431", "Comunicação global", 3600.0), "920");
 
    
        System.out.println(inf);
        System.out.println(ele);
        System.out.println(tele);
    
    
    }
    
}
