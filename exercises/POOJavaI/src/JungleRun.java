import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JungleRun {

    private static ArrayList<HashMap> participants = new ArrayList<HashMap>();


    public static void main(String[] args) {

        HashMap newParticipant = new Participant()
                .setParticipant("V", "10", "some");
        register(newParticipant);
        HashMap newParticipant2 = new Participant()
                .setParticipant("Vi", "10", "some");
        register(newParticipant2);
        System.out.println(participants);

        Scanner option = new Scanner(System.in);
        int selectedOption = option.nextInt();

        System.out.println(selectedOption);

    }

    public static void register(HashMap participant) {

        participants.add(participant);

    }
}
