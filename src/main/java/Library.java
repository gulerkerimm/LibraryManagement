import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<Integer, Book> books = new HashMap<>();
    private int nextId = 1;

    public void addBook(String title, String author) {
        try {
            Book book = new Book(nextId, title, author);
            books.put(book.getId(), book);
            System.out.println("Kitap eklendi ;" + title);

        } catch (Exception e) {
            Utils.printError("Kitap eklenirken bir hata oluştu .");
        }

    }

    public void listBooks() {
        try {
            if (books.isEmpty()) {

                System.out.println("Kütüphanede kitap bulunmamaktadır .");

            } else {
                System.out.println("Kütüphanede Kitaplar  : ");
                for (Book book : books.values()) {
                    book.displayInfo();
                }
            }
        } catch (Exception e) {
            Utils.printError("kitaplar listelenirken bir hata oluştu.");
        }
    }

    public void borrowBook(int id) {
        try {
            Book book = books.get(id);
            if (book == null) {
                Utils.bookNotFoundMessage();
            } else {
                book.borrow();
            }
        } catch (Exception e) {
            Utils.printError("Kitaplar ödünç alınırken bir hata oluştu .");

        }

    }

    public void returnBook(int id) {
        try {
            Book book = books.get(id);
            if (book == null) {
                Utils.bookNotFoundMessage();
            } else {
                book.returnBook();
            }
        } catch (Exception e) {
            Utils.printError("Kitaplar iade edilirken bir hata oluştu. ");
        }
    }
}
