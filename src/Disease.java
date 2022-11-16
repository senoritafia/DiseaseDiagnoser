import java.util.List;

public class Disease {
    private String diseaseName;
    private int diseaseID;
    private List<Symptom> symptoms;

    public Disease() {
    }

    public Disease(String diseaseName, int diseaseID, List<Symptom> symptoms) {
        this.diseaseName = diseaseName;
        this.diseaseID = diseaseID;
        this.symptoms = symptoms;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public int getDiseaseID() {
        return diseaseID;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }
}
