import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);
        System.out.println ("What is your age?");
        int ageAnswer = ageInput.nextInt();
        int datingAge = ageAnswer/2 +7;
        System.out.println ("Your ideal dating age is above " + datingAge);
    }

}




