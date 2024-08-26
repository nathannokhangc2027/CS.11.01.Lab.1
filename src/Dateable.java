import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);
        System.out.println ("What is your age?");
        ageAnswer = ageInput.nextInt();
        int datingAge = ageAnswer/2 +7;
        System.out.println ("Your suitable dating age is above " + datingAge);
    }

}




