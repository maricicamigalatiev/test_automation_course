package md.tekwill.topic1;

public class Angajat {
    String nume;
    int varsta;
    double salariu;
    String gen;


 public Angajat (String numeAtribuit, int varstaAtribuita) {
     nume = numeAtribuit;
     this.varsta = varstaAtribuita;
 }

    public void seteazaSalariul (double salariu) {
        System.out.println( nume + " are salariu 2000 lei");

    }
    public void seteazaGen (String gen) {
        System.out.println( nume + " este de gen Masculin");

    }
}
