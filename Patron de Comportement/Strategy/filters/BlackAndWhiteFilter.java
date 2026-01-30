
package Strategy.filters;

/**
 * Stratégie de filtre Noir et Blanc
 */
public class BlackAndWhiteFilter implements FilterStrategy {
    
    @Override
    public void apply(String fileName) {
        System.out.println("🎨 Application du filtre Noir et Blanc sur: " + fileName);
        applyBWAlgorithm();
        System.out.println("✅ Filtre Noir et Blanc appliqué");
    }
    
    @Override
    public String getFilterName() {
        return "Black and White";
    }
    
    private void applyBWAlgorithm() {
        // Implémentation réelle du filtre
        System.out.println("   - Conversion en niveaux de gris");
        System.out.println("   - Désaturation des couleurs");
        System.out.println("   - Ajustement du contraste");
    }
}
