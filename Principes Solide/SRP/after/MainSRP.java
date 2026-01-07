//package srp.after;

class BookSRP {
    private String title;
    private String author;
    private String content;

    public BookSRP(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }
}

class BookPrinter {
    public void printToScreen(BookSRP book) {
        System.out.println("=== Print to Screen ===");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    public void printToHTML(BookSRP book) {
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}

class BookSaver {
    public void saveToDatabase(BookSRP book) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' en base de données...");
    }

    public void saveToFile(BookSRP book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans le fichier " + filename);
    }
}

class BookBusinessLogic {
    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }
}

public class MainSRP {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("SOLID Principles", "Valéry Monthe", "Cours INF4067");
        new BookPrinter().printToScreen(book);
        new BookSaver().saveToDatabase(book);
        new BookBusinessLogic().emprunter(book, "Marcial");
    }
}
