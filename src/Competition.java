import java.util.ArrayList;
import java.util.List;

public class Competition {
    private double classificationTime;
    private List<Participant> participants;

    public Competition(double classificationTime) {
        this.classificationTime = classificationTime;
        this.participants = new ArrayList<>();
    }

    public void registerParticipant(Participant participant) {
        this.participants.add(participant);
    }

    
}
