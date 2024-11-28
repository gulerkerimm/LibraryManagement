public class Utils {

    public static void printError(String errorMessage) {
        System.err.println(" Hata : " +errorMessage);

    }
    public static void invalidInputMessage(){
        printError("Geçersiz giriş yaptınız . lütfen tekrar deneyin");

    }

    public static void bookNotFoundMessage(){
        printError("Belirtilen ID ile bir kitap bulunamadı ");
    }



}
