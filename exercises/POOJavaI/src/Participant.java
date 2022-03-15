import java.util.HashMap;

public class Participant {
    private final HashMap<String,String> participant;

    {
        participant = new HashMap<>();
    }

    public HashMap setParticipant(String name, String age, String category){

        participant.put("name", name);
        participant.put("age", age);
        participant.put("category", category);

        return participant;
    }
}
