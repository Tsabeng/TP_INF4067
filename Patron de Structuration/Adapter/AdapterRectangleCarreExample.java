interface ICarre {
    float perimetre();
    float aire();
}

class Rectangle {
    private float longueur, largeur;

    public void setLong(float l) {
        longueur = l;
    }

    public void setLarg(float l) {
        largeur = l;
    }

    public float perimetre() {
        return 2 * (longueur + largeur);
    }

    public float aire() {
        return longueur * largeur;
    }
}

class AdaptRectangle implements ICarre {
    private Rectangle rectangle = new Rectangle();

    public AdaptRectangle(float cote) {
        rectangle.setLong(cote);
        rectangle.setLarg(cote);
    }

    public float perimetre() {
        return rectangle.perimetre();
    }

    public float aire() {
        return rectangle.aire();
    }
}

// Client
public class AdapterRectangleCarreExample {
    public static void main(String[] args) {
        System.out.println("=== Carré de côté 5 ===");
        ICarre carre = new AdaptRectangle(5);
        System.out.println("Périmètre : " + carre.perimetre());
        System.out.println("Aire : " + carre.aire());

        System.out.println("\n=== Carré de côté 10 ===");
        carre = new AdaptRectangle(10);
        System.out.println("Périmètre : " + carre.perimetre());
        System.out.println("Aire : " + carre.aire());
    }
}
