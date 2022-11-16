public class Symptom {
    private String symptomName;
    private int symptomID;

    public Symptom() {
    }

    public Symptom(String symptomName, int symptomID) {
        this.symptomName = symptomName;
        this.symptomID = symptomID;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public int getSymptomID() {
        return symptomID;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public void setSymptomID(int symptomID) {
        this.symptomID = symptomID;
    }
}
