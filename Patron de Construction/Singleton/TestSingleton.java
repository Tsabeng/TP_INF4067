public class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(2,3,"Premier");
        s1.affiche();

        Singleton s2 = Singleton.getInstance(10,20,"Deuxième");
        s2.affiche();
    }
}

