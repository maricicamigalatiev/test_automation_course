package md.tekwill.topic4;

public class ExecuteMethods {
    public static void main(String[] args) {
        int result = Methods.sum(10, 5);
        System.out.println(result);

        int result2 = Methods.sum(10, 10);
        System.out.println(result2);

        int result3 = Methods.sum(10, 15);
        System.out.println(result3);

        Methods.sum(10);

        Person vasilicaT = new Person("Vasilica Topor", 20);
        vasilicaT.afiseazaCategoriaDeVarsta();
    }
}
