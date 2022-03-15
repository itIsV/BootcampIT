import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanParticipantData {

    private static String selectedName = "Anonymous";
    private static String selectedAge = "Undefined";
    private static String selectedCategory = "None";

    public static void run() {

        System.out.println("Digite seu nome:\n");

        Scanner name = new Scanner(System.in);
        selectedName = name.next();

        System.out.println("Digite seu idade:\n");

        Scanner age = new Scanner(System.in);
        selectedAge = name.next();

        System.out.println("Digite seu categoria:\n");

        Scanner category = new Scanner(System.in);
        selectedCategory = name.next();

        JungleRun.register(selectedName, selectedAge, selectedCategory
        );

    }

}
