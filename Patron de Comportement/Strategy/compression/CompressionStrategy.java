
package strategy.compression;

/**
 * Interface Strategy pour les algorithmes de compression
 */
public interface CompressionStrategy {
    void compress(String fileName);
    String getFormatName();
}
