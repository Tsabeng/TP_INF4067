public class TestFactory {
    public static void main(String[] args) {

        Fabrique fabrique = new Fabrique();

        Produit p1 = fabrique.creerProduit("P1");
        Produit p2 = fabrique.creerProduit("P2");
        Produit p3 = fabrique.creerProduit("P3");

        p1.executer();
        p2.executer();
        p3.executer();
    }
}

