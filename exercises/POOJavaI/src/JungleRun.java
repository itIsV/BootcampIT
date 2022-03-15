import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JungleRun {

    private static ArrayList<HashMap> participants = new ArrayList();
    private static int selectedOption;
    private static int id;


    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        try {

            System.out.println("Escolha uma das opções abaixo:\n\n" +
                    "1 - Registrar participante\n" +
                    "2 - Mostrar Participantes\n" +
                    "3 - Remover participante\n" +
                    "Qualquer outro numero - Fechar sistema");

            selectedOption = option.nextInt();


            switch (selectedOption) {
                case 1:

                    ScanParticipantData.run();

                    JungleRun.main(null);

                    break;

                case 2:

                    System.out.println(participants);

                    JungleRun.main(null);

                    break;

                default:

                    System.out.println("Até a próxima");

                    break;

            }

        } catch (InputMismatchException _error) {

            System.out.println("Escolha o número da opção");
            JungleRun.main(null);

        }

    }

    public static void register(String name, String age, String category) {

        String currentId = String.valueOf(id);

        HashMap newParticipant = new Participant()
                .setParticipant(currentId, name, age, category);

        participants.add(newParticipant);

        id += 1;

    }
}
