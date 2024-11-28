import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nKütüphane Yönetim Sistemi :");
                System.out.println("1.Kitap ekle");
                System.out.println("2.kitapları listele ");
                System.out.println("Kitapları ödünç al ");
                System.out.println("4.Kitapları iade et ");
                System.out.println("5.Çıkış");
                System.out.println("Seçiminiz : ");
                int choice = scanner.nextInt();
                scanner.nextLine();// satır sonu karakterini temizlemek için  yapmayı unutma

                switch (choice) {
                    case 1:
                        System.out.println("Kitap Başlığı : ");
                        String title = scanner.nextLine();
                        System.out.println("Yazar :");
                        String author = scanner.nextLine();
                        library.addBook(title, author);
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        System.out.println("Ödünç almak istedğiniz kitap ID'si :");
                        int borrowId = scanner.nextInt();
                        library.borrowBook(borrowId);
                        break;
                    case 4:
                        System.out.println("İade etmek istedğiniz kitap Id'si :");
                        int returnId=scanner.nextInt();
                        library.returnBook(returnId);
                        break;
                    case 5:
                        System.out.println("Çıkış yapılıyor ...");
                        scanner.close();
                        return;
                    default:
                        Utils.invalidInputMessage();
                }


            }catch (Exception e ){
                Utils.invalidInputMessage();
                scanner.nextLine(); //Yanlış girişi temizlemek iiçin kullanmayı unutuyorsun
            }
        }
    }
}
