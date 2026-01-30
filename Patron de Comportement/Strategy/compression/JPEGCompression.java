
package strategy.compression;

/**
 * Stratégie de compression JPEG
 */
public class JPEGCompression implements CompressionStrategy {
    
    @Override
    public void compress(String fileName) {
        System.out.println("🔧 Compression JPEG en cours pour: " + fileName);
        // Algorithme spécifique à JPEG
        applyJPEGAlgorithm();
        System.out.println("✅ Compression JPEG terminée");
    }
    
    @Override
    public String getFormatName() {
        return "JPEG";
    }
    
    private void applyJPEGAlgorithm() {
        // Implémentation réelle de l'algorithme JPEG
        System.out.println("   - Application de la compression avec perte");
        System.out.println("   - Réduction de la palette de couleurs");
        System.out.println("   - Encodage Huffman");
    }
}
