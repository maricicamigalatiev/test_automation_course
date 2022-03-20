package md.tekwill.topic2;

public class Main {
    public static void main(String[] args) {
        Persoana angajat001 = new Persoana("Marinel", "Vasilescu", 40);
        angajat001.afiseazaPersoana();
        angajat001.seteazaGen("Masculin");
        angajat001.seteazaGreutate(88.76);
        System.out.println(angajat001.returneazaGen());
        System.out.println(angajat001.returneazaGreutate());
    }
}
