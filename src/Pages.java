import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);
        System.out.println ("What is your age?");
        int age = ageInput.nextInt();
        int pagesToRead = 100 - age;
        System.out.println ("You should read " + pagesToRead + " pages before putting down a book.");

    }

}
