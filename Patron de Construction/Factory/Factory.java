public interface Produit {
    void executer();
}

class Produit1 implements Produit {
    public void executer() {
        System.out.println("Execution du Produit 1");
    }
}

class Produit2 implements Produit {
    public void executer() {
        System.out.println("Execution du Produit 2");
    }
}

class Produit3 implements Produit {
    public void executer() {
        System.out.println("Execution du Produit 3");
    }
}

public class Fabrique {

    public Produit creerProduit(String type) {
        if (type.equals("P1"))
            return new Produit1();
        else if (type.equals("P2"))
            return new Produit2();
        else if (type.equals("P3"))
            return new Produit3();

        return null;
    }
}

