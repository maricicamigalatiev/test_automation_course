package md.tekwill.topic5;

public class Patrat extends FiguraGeometrica {
    private double latura;

    public void setLatura(double latura) {
        if (latura<0){
            System.out.println("Latura patratului are valoare negativa.");
        }else {
            System.out.println("Latura patratului are valoare pozitiva.");
            this.latura = latura;
        }
    }

    public double getLatura() {
        return latura;
    }

    @Override
    double returneazaAria() {
        this.ariaFigurii = latura*latura;
        return this.ariaFigurii;
    }

    @Override
    double returneazaPerimetrul() {
        this.perimetrulFigurii = 4*latura;
        return this.perimetrulFigurii;
    }
}
