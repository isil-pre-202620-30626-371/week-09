public class Participant {

    private int id;
    private String name;
    private double personalRecord;
    private double classificationRecord;
    private double finalRecord;

    public Participant(int id, String name, double personalRecord) {
        this.id = id;
        this.name = name;
        this.personalRecord = personalRecord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPersonalRecord() {
        return personalRecord;
    }

    public void setPersonalRecord(double personalRecord) {
        this.personalRecord = personalRecord;
    }

    public double getClassificationRecord() {
        return classificationRecord;
    }

    public void setClassificationRecord(double classificationRecord) {
        this.classificationRecord = classificationRecord;
    }

    public double getFinalRecord() {
        return finalRecord;
    }

    public void setFinalRecord(double finalRecord) {
        this.finalRecord = finalRecord;
    }

}
