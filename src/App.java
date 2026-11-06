public class App {
    public static void main(String[] args) throws Exception {
        Participant participant = new Participant(1, "Francisco Paredes", 70.5);

        System.out.println(participant);
        
        Competition competition = new Competition(80);

        competition.registerParticipant(participant);
    }
}
