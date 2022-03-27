package md.tekwill.topic5;

public class Romb extends FiguraGeometrica {
    private double diagonalaMica;
    private double diagonalaMare;
    private double latura;

    public void setDiagonalaMare(double diagonalaMare) {
        if (diagonalaMare < 0) {
            System.out.println("Diagonala mare a rombului are valoare negativa.");
        } else {
            System.out.println("Diagonala mare a rombului are valoare pozitiva.");
            this.diagonalaMare = diagonalaMare;
        }
    }

    public void setDiagonale(double diagonalaMare, double diagonalaMica) {
        if (diagonalaMare > diagonalaMica && diagonalaMare > 0 && diagonalaMica > 0) {
            this.diagonalaMare = diagonalaMare;
            this.diagonalaMica = diagonalaMica;
            System.out.println("Diagonalele rombului au fost setate corect.");
        } else {
            System.out.println("Diagonala rombului au fost setate gresit.");
        }
    }

    public void setLatura(double latura) {
        if (latura < 0) {
            System.out.println("Latura rombului are valoare negativa.");
        } else {
            System.out.println("Latura rombului are valoare pozitiva.");
            this.latura = latura;
        }
    }

    public double getDiagonalaMare() {
        return diagonalaMare;
    }

    public double getDiagonalaMica() {
        return diagonalaMica;
    }

    public double getLatura() {
        return latura;
    }

    @Override
    double returneazaAria() {
        this.ariaFigurii = diagonalaMare * diagonalaMica / 2;
        return this.ariaFigurii;
    }

    @Override
    double returneazaPerimetrul() {
        this.perimetrulFigurii = 4 * latura;
        return this.perimetrulFigurii;
    }
}
