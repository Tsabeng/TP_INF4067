
package Strategy;

import strategy.compression.CompressionStrategy;
import strategy.filters.FilterStrategy;

/**
 * Contexte qui utilise les stratégies
 * Classe principale de l'application de sauvegarde d'images
 */
public class ImageStorage {
    private CompressionStrategy compressionStrategy;
    private FilterStrategy filterStrategy;
    private String fileName;
    
    // Constructeur avec injection des stratégies
    public ImageStorage(String fileName, 
                       CompressionStrategy compressionStrategy, 
                       FilterStrategy filterStrategy) {
        this.fileName = fileName;
        this.compressionStrategy = compressionStrategy;
        this.filterStrategy = filterStrategy;
    }
    
    // Méthodes pour changer les stratégies dynamiquement
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.compressionStrategy = strategy;
        System.out.println("🔄 Changement de stratégie de compression vers: " + 
                          strategy.getFormatName());
    }
    
    public void setFilterStrategy(FilterStrategy strategy) {
        this.filterStrategy = strategy;
        System.out.println("🔄 Changement de stratégie de filtre vers: " + 
                          strategy.getFilterName());
    }
    
    // Méthode principale de sauvegarde
    public void store() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("💾 DÉBUT DE LA SAUVEGARDE: " + fileName);
        System.out.println("=".repeat(60));
        
        // Étape 1: Compression
        if (compressionStrategy != null) {
            System.out.println("\n📦 ÉTAPE 1: COMPRESSION");
            compressionStrategy.compress(fileName);
        }
        
        // Étape 2: Application du filtre
        if (filterStrategy != null) {
            System.out.println("\n✨ ÉTAPE 2: FILTRAGE");
            filterStrategy.apply(fileName);
        }
        
        // Étape 3: Sauvegarde finale
        System.out.println("\n💿 ÉTAPE 3: SAUVEGARDE FINALE");
        saveToDisk();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("🎉 SAUVEGARDE TERMINÉE AVEC SUCCÈS!");
        System.out.println("=".repeat(60) + "\n");
    }
    
    private void saveToDisk() {
        // Simulation de sauvegarde sur disque
        System.out.println("   - Écriture des données sur le disque");
        System.out.println("   - Vérification de l'intégrité");
        System.out.println("   - Mise à jour des métadonnées");
    }
    
    // Getters
    public String getFileName() { return fileName; }
    public String getCompressionType() { 
        return compressionStrategy != null ? compressionStrategy.getFormatName() : "Aucune"; 
    }
    public String getFilterType() { 
        return filterStrategy != null ? filterStrategy.getFilterName() : "Aucun"; 
    }
}
