//package srp.before;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }

    public void printToScreen() {
        System.out.println("Titre: " + title);
        System.out.println("Auteur: " + author);
        System.out.println("Contenu: " + content);
    }

    public void saveToDatabase() {
        System.out.println("Sauvegarde du livre '" + title + "' en base de données...");
    }

    public void emprunter(String lecteur) {
        System.out.println("Emprunt du livre '" + title + "' par " + lecteur);
    }

    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "M1 GL", "Révision SRP");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}
