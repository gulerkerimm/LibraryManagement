public class Book {

    private int id ;
    private String title ;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed=false;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrow(){
        if (!isBorrowed){
            isBorrowed=true;
            System.out.println(title + "ödünç alındı .");
        }else{
            Utils.printError(title + "zaten ödünç alınmış .");
        }
    }
public void returnBook(){
        if (isBorrowed){
            isBorrowed=false;
            System.out.println(title + "iade edildi");
        }else{
            Utils.printError(title+ "zaten kütüphanede .");
        }
}

    public void displayInfo() {
        System.out.println("ID :"+   id+"Başlık : "+title +"Yazar : " +author+"Durum : "+ (isBorrowed?  "Ödünç alındı ":"Mevcut "));

    }
}

























