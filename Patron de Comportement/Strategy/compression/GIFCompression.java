
package strategy.compression;

/**
 * Stratégie de compression GIF
 */
public class GIFCompression implements CompressionStrategy {
    
    @Override
    public void compress(String fileName) {
        System.out.println("🔧 Compression GIF en cours pour: " + fileName);
        // Algorithme spécifique à GIF
        applyGIFAlgorithm();
        System.out.println("✅ Compression GIF terminée");
    }
    
    @Override
    public String getFormatName() {
        return "GIF";
    }
    
    private void applyGIFAlgorithm() {
        // Implémentation réelle de l'algorithme GIF
        System.out.println("   - Palette limitée à 256 couleurs");
        System.out.println("   - Support de l'animation");
        System.out.println("   - Compression LZW");
    }
}
