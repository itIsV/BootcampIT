import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JungleRun {

    private static ArrayList<HashMap> participants = new ArrayList<HashMap>();
    private static int selectedOption;


    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        try {

            System.out.println("Escolha uma das opções abaixo:\n\n" +
                    "1 - Registrar participante");

            selectedOption = option.nextInt();

            if(selectedOption == 1) {

                ScanParticipantData.run();

                System.out.println(participants);

            } else {

                System.out.println("Escolha o número 1");

            }

        } catch (InputMismatchException _error) {
//
            System.out.println("Rode o programa novamente e escolha o número da opção");
//
        }



    }

    public static void register(String name, String age, String category) {

        HashMap newParticipant = new Participant()
                .setParticipant(name, age, category);

        participants.add(newParticipant);

    }
}
