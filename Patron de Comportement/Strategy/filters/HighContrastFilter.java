
package Strategy.filters;

/**
 * Stratégie de filtre Haut Contraste
 */
public class HighContrastFilter implements FilterStrategy {
    
    @Override
    public void apply(String fileName) {
        System.out.println("🎨 Application du filtre Haut Contraste sur: " + fileName);
        applyContrastAlgorithm();
        System.out.println("✅ Filtre Haut Contraste appliqué");
    }
    
    @Override
    public String getFilterName() {
        return "High Contrast";
    }
    
    private void applyContrastAlgorithm() {
        // Implémentation réelle du filtre
        System.out.println("   - Augmentation de la différence lumineuse");
        System.out.println("   - Renforcement des contours");
        System.out.println("   - Ajustement des niveaux de gris");
    }
}
