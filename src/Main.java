import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Symptom> symptomList = new ArrayList<>();
        // figure out how to make a hashmap with boolean values.
        symptomList.add(new Symptom("loose stool", 1));
        symptomList.add(new Symptom("vomiting", 2));
        symptomList.add(new Symptom("abdominal cramps", 3));
        symptomList.add(new Symptom("nausea", 4));
        symptomList.add(new Symptom("fever", 5));
        symptomList.add(new Symptom("fatigue", 6));
        symptomList.add(new Symptom("sore throat", 7));
        symptomList.add(new Symptom("aches", 8));
        symptomList.add(new Symptom("low appetite", 9));
        symptomList.add(new Symptom("rash", 10));
        symptomList.add(new Symptom("swollen lymph nodes", 11));
        symptomList.add(new Symptom("swollen tonsils", 12));
        symptomList.add(new Symptom("cough", 13));
        symptomList.add(new Symptom("chills", 14));
        symptomList.add(new Symptom("shortness of breath", 15));

        ArrayList<Disease> diseaseList = new ArrayList<>();
        diseaseList.add(new Disease("Diarrhea", new int[]{1, 2, 3, 4, 5}, new int[]{4, 1, 3, 2, 1}));
        diseaseList.add(new Disease("Mononucleosis", new int[]{5, 6, 7, 8, 9, 10, 11}, new int[]{4, 3, 2, 3, 2, 1, 3}));
        diseaseList.add(new Disease("Chickenpox", new int[]{5, 6, 8, 9, 10}, new int[]{2, 2, 3, 3, 4}));
        diseaseList.add(new Disease("Strep Throat", new int[]{2, 5, 7, 11, 12}, new int[]{2, 3, 4, 3, 3}));
        diseaseList.add(new Disease("Covid-19", new int[]{5, 6, 13, 14, 15}, new int[]{4, 3, 1, 2, 3}));
        //initializes scanner
        Scanner symptomScanner = new Scanner(System.in);
        System.out.println("Enter your symptoms! Separate symptoms with a comma!");
        //reads in human input
        String scanLineSymptom = symptomScanner.nextLine();
        String[] symptomStringList = scanLineSymptom.split(",\\s*");
        System.out.println(Arrays.toString(symptomStringList));
        //Stop here for testing
        // create map of system ids to name
        Symptom[] patientSymptoms = Arrays.stream(symptomStringList).map(Symptom::getSymptom).filter(Objects::nonNull).toArray(Symptom[]::new);

        for(Disease disease : diseaseList) {
            int total = 0;
            for (Symptom symptom : patientSymptoms) {
                if (disease.hasSymptom(symptom.id())) {
                    System.out.printf("%s has symptom %s with weight %d\n", disease.name(), symptom.name(), disease.symptomWeight(symptom.id()));
                    total += disease.symptomWeight(symptom.id());

                };
            }

            System.out.printf("Total weight: %d\n", total);
        }


    }
}

