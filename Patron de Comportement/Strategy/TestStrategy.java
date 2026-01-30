
package Strategy;

import Strategy.compression.*;
import Strategy.filters.*;

/**
 * Programme de test complet pour le pattern Strategy
 */
public class TestStrategy {
    public static void main(String[] args) {
        System.out.println("=== TEST PATTERN STRATEGY ===");
        System.out.println("=== Application de sauvegarde d'images ===\n");
        
        // Création des différentes stratégies
        CompressionStrategy jpeg = new JPEGCompression();
        CompressionStrategy png = new PNGCompression();
        CompressionStrategy gif = new GIFCompression();
        
        FilterStrategy highContrast = new HighContrastFilter();
        FilterStrategy blackWhite = new BlackAndWhiteFilter();
        FilterStrategy sepia = new SepiaFilter();
        
        // ========== TEST 1: Image JPEG avec filtre Haut Contraste ==========
        System.out.println("📸 TEST 1: Photo JPEG avec filtre Haut Contraste");
        System.out.println("-".repeat(50));
        
        ImageStorage photo1 = new ImageStorage("vacances.jpg", jpeg, highContrast);
        photo1.store();
        
        // ========== TEST 2: Image PNG avec filtre Noir et Blanc ==========
        System.out.println("\n📸 TEST 2: Capture PNG avec filtre Noir et Blanc");
        System.out.println("-".repeat(50));
        
        ImageStorage capture = new ImageStorage("capture_ecran.png", png, blackWhite);
        capture.store();
        
        // ========== TEST 3: GIF animé avec filtre Sépie ==========
        System.out.println("\n📸 TEST 3: Animation GIF avec filtre Sépie");
        System.out.println("-".repeat(50));
        
        ImageStorage animation = new ImageStorage("animation.gif", gif, sepia);
        animation.store();
        
        // ========== TEST 4: Changement dynamique de stratégie ==========
        System.out.println("\n🔄 TEST 4: Changement dynamique de stratégies");
        System.out.println("-".repeat(50));
        
        ImageStorage photoModifiable = new ImageStorage("photo_modifiable.jpg", jpeg, highContrast);
        
        System.out.println("\nConfiguration initiale:");
        System.out.println("Format: " + photoModifiable.getCompressionType());
        System.out.println("Filtre: " + photoModifiable.getFilterType());
        
        // Changement à la volée
        photoModifiable.setCompressionStrategy(png);
        photoModifiable.setFilterStrategy(sepia);
        
        System.out.println("\nNouvelle configuration:");
        System.out.println("Format: " + photoModifiable.getCompressionType());
        System.out.println("Filtre: " + photoModifiable.getFilterType());
        
        photoModifiable.store();
        
        // ========== DÉMONSTRATION DES AVANTAGES ==========
        System.out.println("\n" + "⭐".repeat(60));
        System.out.println("AVANTAGES DU PATTERN STRATEGY:");
        System.out.println("⭐".repeat(60));
        
        System.out.println("\n1. ✅ RESPECT DU PRINCIPE OCP (Open/Closed):");
        System.out.println("   - On peut ajouter de nouvelles stratégies SANS modifier ImageStorage");
        System.out.println("   - Exemple: Ajouter WebPCompression.java");
        
        System.out.println("\n2. ✅ ÉLIMINATION DES CONDITIONS:");
        System.out.println("   - Pas de if/else ou switch sur les types");
        System.out.println("   - Le code est plus propre et maintenable");
        
        System.out.println("\n3. ✅ FLEXIBILITÉ:");
        System.out.println("   - Changement de stratégie à l'exécution");
        System.out.println("   - Combinaisons illimitées");
        
        System.out.println("\n4. ✅ RÉUTILISATION:");
        System.out.println("   - Mêmes stratégies utilisables dans différents contextes");
        System.out.println("   - Exemple: JPEGCompression utilisable ailleurs");
    }
}
