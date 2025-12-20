public final class Singleton {
    private static Singleton instance = null;

    private int x;
    private int y;
    private String nom;

    private Singleton() {
        this.x = 0;
        this.y = 0;
        this.nom = "default";
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
        this.nom = "default";
    }

    private Singleton(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public static Singleton getInstance(int x, int y) {
        if (instance == null)
            instance = new Singleton(x, y);
        return instance;
    }

    public static Singleton getInstance(int x, int y, String nom) {
        if (instance == null)
            instance = new Singleton(x, y, nom);
        return instance;
    }

    public void affiche() {
        System.out.println("Instance : x=" + x + ", y=" + y + ", nom=" + nom);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

