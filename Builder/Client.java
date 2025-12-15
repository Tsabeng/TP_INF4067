public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        MonteurPizza monteurReine = new MonteurPizzaReine();
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();

        // Construire une pizza reine
        directeur.setMonteur(monteurReine);
        Pizza pizzaReine = directeur.construire();
        System.out.println("=== Pizza Reine ===");
        pizzaReine.print();

        System.out.println("\n=== Pizza Piquante ===");
        
        // Construire une pizza piquante
        directeur.setMonteur(monteurPiquante);
        Pizza pizzaPiquante = directeur.construire();
        pizzaPiquante.print();
    }
}
