// Interface commune
interface Document {
    void setContent(String content);
    void dessine();
    void imprime();
}

// Classe existante
class DocumentHtml implements Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Contenu HTML défini : " + content);
    }

    public void dessine() {
        System.out.println("Affichage du document HTML...");
    }

    public void imprime() {
        System.out.println("Impression du document HTML...");
    }
}

// Composant externe 
class ComposantPdf {
    public void pdfFixeContent(String content) {
        System.out.println("[PDF] Contenu fixé : " + content);
    }

    public void pdfPrepareAffichage() {
        System.out.println("[PDF] Préparation de l'affichage...");
    }

    public void pdfRafraichi() {
        System.out.println("[PDF] Rafraîchissement...");
    }

    public void pdfTermineAffichage() {
        System.out.println("[PDF] Affichage terminé.");
    }

    public void pdfEnvoieImprimante() {
        System.out.println("[PDF] Envoi à l'imprimante...");
    }
}

// Adaptateur PDF
class DocumentPdf implements Document {
    private ComposantPdf outilPdf = new ComposantPdf();

    public void setContent(String content) {
        outilPdf.pdfFixeContent(content);
    }

    public void dessine() {
        outilPdf.pdfPrepareAffichage();
        outilPdf.pdfRafraichi();
        outilPdf.pdfTermineAffichage();
    }

    public void imprime() {
        outilPdf.pdfEnvoieImprimante();
    }
}

// Client
public class AdapterDocumentExample {
    public static void main(String[] args) {
        System.out.println("=== Document HTML ===");
        Document doc1 = new DocumentHtml();
        doc1.setContent("Hello HTML");
        doc1.dessine();
        doc1.imprime();

        System.out.println("\n=== Document PDF (via Adaptateur) ===");
        Document doc2 = new DocumentPdf();
        doc2.setContent("Hello PDF");
        doc2.dessine();
        doc2.imprime();
    }
}
