import java.util.ArrayList;
import java.util.List;

// ===== 1. Component =====
abstract class ElementFichier {
    protected String nom;
    protected String type;
    
    public ElementFichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }
    
    public abstract void decrire();
    
    // Méthodes par défaut (pour les feuilles)
    public void ajouter(ElementFichier element) {
        throw new UnsupportedOperationException("Ajout impossible pour " + nom);
    }
    
    public void supprimer(ElementFichier element) {
        throw new UnsupportedOperationException("Suppression impossible pour " + nom);
    }
    
    public ElementFichier obtenir(int index) {
        throw new UnsupportedOperationException("Obtention impossible pour " + nom);
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getType() {
        return type;
    }
}

// ===== 2. Leaf =====
class FichierTxt extends ElementFichier {
    public FichierTxt(String nom) {
        super(nom, "txt");
    }
    
    @Override
    public void decrire() {
        System.out.println("📄 Fichier TXT: " + nom);
    }
}

class FichierPdf extends ElementFichier {
    public FichierPdf(String nom) {
        super(nom, "pdf");
    }
    
    @Override
    public void decrire() {
        System.out.println("📕 Fichier PDF: " + nom);
    }
}

// ===== 3. Composite =====
class Dossier extends ElementFichier {
    private List<ElementFichier> enfants;
    
    public Dossier(String nom) {
        super(nom, "dossier");
        this.enfants = new ArrayList<>();
    }
    
    @Override
    public void decrire() {
        System.out.println("\n📁 Dossier: " + nom + " (contenu)");
        System.out.println("─".repeat(30));
        for (ElementFichier enfant : enfants) {
            System.out.print("  ");
            enfant.decrire();
        }
        System.out.println("─".repeat(30));
    }
    
    @Override
    public void ajouter(ElementFichier element) {
        enfants.add(element);
        System.out.println("✓ " + element.getNom() + " ajouté à " + nom);
    }
    
    @Override
    public void supprimer(ElementFichier element) {
        if (enfants.remove(element)) {
            System.out.println("✗ " + element.getNom() + " supprimé de " + nom);
        }
    }
    
    @Override
    public ElementFichier obtenir(int index) {
        if (index >= 0 && index < enfants.size()) {
            return enfants.get(index);
        }
        return null;
    }
    
    public int getNombreElements() {
        return enfants.size();
    }
}

// ===== 4. Client =====
public class GestionFichiersSystem {
    public static void main(String[] args) {
        System.out.println("=== SYSTÈME DE GESTION DE FICHIERS ===\n");
        
        // Création des fichiers
        FichierTxt fichier1 = new FichierTxt("rapport.txt");
        FichierPdf fichier2 = new FichierPdf("manuel.pdf");
        FichierTxt fichier3 = new FichierTxt("notes.txt");
        FichierPdf fichier4 = new FichierPdf("presentation.pdf");
        
        // Création des dossiers
        Dossier racine = new Dossier("Racine");
        Dossier documents = new Dossier("Documents");
        Dossier images = new Dossier("Images");
        
        // Construction de l'arborescence
        racine.ajouter(documents);
        racine.ajouter(images);
        
        documents.ajouter(fichier1);
        documents.ajouter(fichier2);
        
        images.ajouter(fichier3);
        images.ajouter(fichier4);
        
        // Ajout d'un sous-dossier
        Dossier sousDocs = new Dossier("Sous-Documents");
        FichierTxt fichier5 = new FichierTxt("secret.txt");
        sousDocs.ajouter(fichier5);
        documents.ajouter(sousDocs);
        
        System.out.println("\n=== DESCRIPTION COMPLÈTE ===");
        racine.decrire();
        
        System.out.println("\n=== OPÉRATIONS ===");
        
        // Test obtenir()
        ElementFichier elem = documents.obtenir(0);
        if (elem != null) {
            System.out.print("Premier élément de Documents: ");
            elem.decrire();
        }
        
        // Test supprimer()
        documents.supprimer(fichier1);
        
        System.out.println("\n=== DESCRIPTION APRÈS SUPPRESSION ===");
        documents.decrire();
        
        System.out.println("\n=== DESCRIPTION INDIVIDUELLE ===");
        fichier2.decrire();
        
        // Test sur feuille (doit lancer exception)
        System.out.println("\n=== TEST SUR FEUILLE ===");
        try {
            fichier2.ajouter(racine);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception attendue: " + e.getMessage());
        }
    }
}
