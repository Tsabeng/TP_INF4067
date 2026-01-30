
package Strategy.filters;

/**
 * Stratégie de filtre Sépia
 */
public class SepiaFilter implements FilterStrategy {
    
    @Override
    public void apply(String fileName) {
        System.out.println("🎨 Application du filtre Sépia sur: " + fileName);
        applySepiaAlgorithm();
        System.out.println("✅ Filtre Sépia appliqué");
    }
    
    @Override
    public String getFilterName() {
        return "Sepia";
    }
    
    private void applySepiaAlgorithm() {
        // Implémentation réelle du filtre
        System.out.println("   - Application de tons sépia");
        System.out.println("   - Réchauffement des couleurs");
        System.out.println("   - Ajout d'effet vieillissement");
    }
}
