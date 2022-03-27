package md.tekwill.topic5;

public abstract class FiguraGeometrica {

    protected double ariaFigurii;
    protected double perimetrulFigurii;

    abstract double returneazaAria ();
    abstract double returneazaPerimetrul ();

    public double getAriaFigurii() {
        return ariaFigurii;
    }
    public double getPerimetrulFigurii() {
        return perimetrulFigurii;
    }
}
