
package Template_method;

/**
 * Programme de test pour Template Method
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        System.out.println("=== TEST TEMPLATE METHOD ===");
        System.out.println("=== Système de vente en ligne ===\n");
        
        // Test 1: Commande au Cameroun
        System.out.println("1. Commande au Cameroun:");
        Commande cmdCam = new CommandeCameroun(100000);
        cmdCam.calculeMontantTtc();
        System.out.println("Montant HT: " + cmdCam.getMontantHt());
        System.out.println("Montant TTC: " + cmdCam.getMontantTtc());
        
        System.out.println("\n" + "-".repeat(50) + "\n");
        
        // Test 2: Commande au Gabon
        System.out.println("2. Commande au Gabon:");
        Commande cmdGab = new CommandeGabon(100000, 60000, 40000);
        cmdGab.calculeMontantTtc();
        System.out.println("Montant HT Total: " + cmdGab.getMontantHt());
        System.out.println("Montant HT Prestation: 60000");
        System.out.println("Montant HT Matériel: 40000");
        System.out.println("Montant TTC: " + cmdGab.getMontantTtc());
        
        System.out.println("\n" + "-".repeat(50) + "\n");
        
        // Test 3: Démonstration du pattern
        System.out.println("3. Démonstration du Template Method:");
        System.out.println("- L'algorithme calculeMontantTtc() est FIXE");
        System.out.println("- Seule l'étape calculeTva() est VARIABLE");
        System.out.println("- Les sous-classes n'ont pas à réécrire tout l'algorithme");
    }
}
