
package strategy.compression;

/**
 * Stratégie de compression PNG
 */
public class PNGCompression implements CompressionStrategy {
    
    @Override
    public void compress(String fileName) {
        System.out.println("🔧 Compression PNG en cours pour: " + fileName);
        // Algorithme spécifique à PNG
        applyPNGAlgorithm();
        System.out.println("✅ Compression PNG terminée");
    }
    
    @Override
    public String getFormatName() {
        return "PNG";
    }
    
    private void applyPNGAlgorithm() {
        // Implémentation réelle de l'algorithme PNG
        System.out.println("   - Compression sans perte");
        System.out.println("   - Support de la transparence");
        System.out.println("   - Filtrage des scanlines");
    }
}
