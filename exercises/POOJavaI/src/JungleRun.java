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

                    printParticipants();

                    JungleRun.main(null);

                    break;

                case 3:

                    removeParticipant();

                    JungleRun.main(null);

                    break;

                default:

                    System.out.println("Até a próxima");

                    break;

            }

        } catch (InputMismatchException _error) {

            System.out.println("Escolha o número da opção\n\n");
            JungleRun.main(null);

        }

    }

    public static void register(String name, String age, String category) {

//        String currentId = String.valueOf(id);
        String currentId = Integer.toString(id); // opção mais semântica

        HashMap newParticipant = new Participant()
                .setParticipant(currentId, name, age, category);

        participants.add(newParticipant);

        id += 1;

    }

    private static void printParticipants() {
        System.out.println(participants + "\n");
    }

    private static void removeParticipant() {

        Scanner getId = new Scanner(System.in);

        System.out.println("Insira o id do participante:\n");

        String id = getId.next();

       boolean removed =  participants.removeIf(participant -> participant.containsValue(id));

       if(removed) {

           System.out.println("Participante removido com sucesso!\n");

       } else {

           System.out.println("participante não existe.\n");

       }
    }
}
