import java.util.*;

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
        String symptomNamesUnprocessed = symptomScanner.nextLine();
        //System.out.println(symptomNamesUnprocessed);
        String[] symptomNamesProcessed = symptomNamesUnprocessed.split(", ");
        System.out.println(Arrays.toString(symptomNamesProcessed));
        //Stop here for testing
        // create map of system ids to name
        Symptom[] patientSymptoms = Arrays.stream(symptomNamesProcessed).map(Symptom::getSymptom).toArray(Symptom[]::new);

     /*   for (String s:symptomNamesProcessed) {
            if(s.equals(symptomID1)||s.equals(symptomID1)||s.equals(symptomID1)||s.equals(symptomID1)||){
                System.out.println("yay!");
            }
        }
*/


        //diseaseIDList.add(2);
        //[] diseaseIDArray= new int [16];
        // see if map contains symptom name

        //Error here, come back, for some reason it is always true


        //System.out.println(Arrays.toString(diseaseIDArray));
        // boolean hasName1 = symptomID.containsKey("Loose Stool");
 /*
        boolean hasName1 = symptomList.contains("Loose Stool");
        if (hasName1 == true) {
            int symptoms = symptomID.get("Loose Stool");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName2 = symptomList.contains("Vomiting");
        if (hasName2 == true) {
            int symptoms = symptomID.get("Vomiting");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }

        boolean hasName3 = symptomList.contains("Abdominal Cramps");
        if (hasName3 == true) {
            int symptoms = symptomID.get("Abdominal Cramps");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName4 = symptomList.contains("Nausea");
        if (hasName4 == true) {
            int symptoms = symptomID.get("Nausea");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName5 = symptomList.contains("Fever");
        if (hasName5 == true) {
            int symptoms = symptomID.get("Fever");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName6 = symptomList.contains("Fatigue");
        if (hasName6 == true) {
            int symptoms = symptomID.get("Fatigue");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName7 = symptomList.contains("Sore Throat");
        if (hasName7 == true) {
            int symptoms = symptomID.get("Sore Throat");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName8 = symptomList.contains("Aches");
        if (hasName8 == true) {
            int symptoms = symptomID.get("Aches");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName9 = symptomList.contains("Low Appetite");
        if (hasName9 == true) {
            int symptoms = symptomID.get("Low Appetite");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName10 = symptomList.contains("Rash");
        if (hasName10 == true) {
            int symptoms = symptomID.get("Rash");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName11 = symptomList.contains("Swollen Lymph Nodes");
        if (hasName11 == true) {
            int symptoms = symptomID.get("Swollen Lymph Nodes");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName12 = symptomList.contains("Swollen Tonsils");
        if (hasName12 == true) {
            int symptoms = symptomID.get("Swollen Tonsils");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName13 = symptomList.contains("Cough");
        if (hasName13 == true) {
            int symptoms = symptomID.get("Cough");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName14 = symptomList.contains("Chills");
        if (hasName14 == true) {
            int symptoms = symptomID.get("Chills");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }
        boolean hasName15 = symptomList.contains("Shortness Of Breath");
        if (hasName15 == true) {
            int symptoms = symptomID.get("Shortness Of Breath");
            System.out.println(symptoms);
            diseaseIDList.add(symptoms);
        }

       /* System.out.println(diseaseIDList);

        boolean hasName1 = symptomID.containsKey("Loose Stool");
        if (hasName1 = true) {
            System.out.println("hello!");
            }
        boolean hasName2 = symptomID.containsKey("Vomiting");
        if (hasName2 = true) {
            System.out.println("hello!");
        }
        boolean hasName3 = symptomID.containsKey("Abdominal Cramps");
        if (hasName3 = true) {
            System.out.println("hello2!");
        }
        boolean hasName4 = symptomID.containsKey("Nausea");
        if (hasName4 = true) {
            System.out.println("hi!");
        }
        boolean hasName5 = symptomID.containsKey("Fever");
        if (hasName5 = true) {
            System.out.println("hi!");
        }
        boolean hasName6 = symptomID.containsKey("Fatigue");
        if (hasName6 = true) {
            System.out.println("hi!");
        }
        boolean hasName7 = symptomID.containsKey("Sore Throat");
        if (hasName7 = true) {
            System.out.println("hi!");
        }
        boolean hasName8 = symptomID.containsKey("Aches");
        if (hasName8 = true) {
            System.out.println("hi!");
        }
        boolean hasName9 = symptomID.containsKey("Low Appetite");
        if (hasName9 = true) {
            System.out.println("hi!");
        }
        boolean hasName10 = symptomID.containsKey("Rash");
        if (hasName10 = true) {
            System.out.println("hi!");
        }
        boolean hasName11 = symptomID.containsKey("Swollen Lymph Nodes");
        if (hasName11 = true) {
            System.out.println("hi!");
        }
        boolean hasName12 = symptomID.containsKey("Swollen Tonsils");
        if (hasName12 = true) {
            System.out.println("hi!");
        }
        boolean hasName13 = symptomID.containsKey("Cough");
        if (hasName13 = true) {
            System.out.println("hi!");
        }
        boolean hasName14 = symptomID.containsKey("Chills");
        if (hasName14 = true) {
            System.out.println("hi!");
        }

        boolean hasName15 = symptomID.containsKey("Shortness of Breath");
        if (hasName15 = true) {
            System.out.println("hi!");
        }


*/
//        for (String symptom : symptomList) {
//            symptom = symptom.toLowerCase();
//            if (symptomList.containsKey(symptom)) {
//                int id = symptomList.get(symptom);
//                System.out.println(id);
//                diseaseIDList.add(id);
//            }
//        }
//
//        int Diarrhea = 0;
//        for (int id : diseaseIDList) {
//            if (id == 1 || id == 2 || id == 3 || id == 4 || id == 5) {
//                Diarrhea++;
//            }
//        }
//        System.out.println("Diarrhea");
//        System.out.println(Diarrhea);
//
//
//        int Mononucleosis = 0;
//        for (int id : diseaseIDList) {
//            if (id == 5 || id == 6 || id == 7 || id == 8 || id == 10 | id == 11) {
//                Mononucleosis++;
//            }
//        }
//        System.out.println("Mononucleosis");
//        System.out.println(Mononucleosis);
//
//        int Chickenpox = 0;
//        for (int id : diseaseIDList) {
//            if (id == 5 || id == 6 || id == 8 || id == 9 || id == 10) {
//                Chickenpox++;
//            }
//        }
//        System.out.println("Chickenpox");
//        System.out.println(Chickenpox);
//
//        int StrepThroat = 0;
//        for (int id : diseaseIDList) {
//            if (id == 2 || id == 5 || id == 7 || id == 11 || id == 12) {
//                StrepThroat++;
//            }
//        }
//        System.out.println("StrepThroat");
//        System.out.println(StrepThroat);
//
//        int Covid19 = 0;
//        for (int id : diseaseIDList) {
//            if (id == 5 || id == 6 || id == 13 || id == 14 || id == 15) {
//                Covid19++;
//            }
//        }
//        System.out.println("Covid19");
//        System.out.println(Covid19);

        for(Disease disease : diseaseList) {
            for (Symptom symptom : patientSymptoms) {
                if (disease.hasSymptom(symptom.id())) {
                    System.out.printf("%s has symptom %s with weight %d ", disease.name(), symptom.name(), disease.symptomWeight(symptom.id()));
                };
            }
        }


    }
}

