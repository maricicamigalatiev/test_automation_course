package md.tekwill.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cercRotund = new Cerc();
        Patrat patratPoligon = new Patrat();
        Romb rombParalelogram = new Romb();

        cercRotund.setRazaCerului(1);
        System.out.println("Aria cercului este: " + cercRotund.returneazaAria());

        patratPoligon.setLatura(10);
        patratPoligon.returneazaAria();
        System.out.println("Aria patratului este: " + patratPoligon.getAriaFigurii());
        patratPoligon.returneazaPerimetrul();
        System.out.println("Perimetrul patratului este: " + patratPoligon.getPerimetrulFigurii());

        rombParalelogram.setDiagonale(25, 12);
        rombParalelogram.returneazaAria();
        System.out.println("Aria rombului este: " + rombParalelogram.getAriaFigurii());
        rombParalelogram.setLatura(4);
        rombParalelogram.returneazaPerimetrul();
        System.out.println("Perimetrul rombului este: " + rombParalelogram.getPerimetrulFigurii());
    }
}
