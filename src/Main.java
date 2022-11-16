import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        List<String> symptomList = new ArrayList<>(Arrays.asList(symptomNamesProcessed));

     /*   for (String s:symptomNamesProcessed) {
            if(s.equals(symptomID1)||s.equals(symptomID1)||s.equals(symptomID1)||s.equals(symptomID1)||){
                System.out.println("yay!");
            }
        }
*/
        HashMap<String, Integer> symptomID = new HashMap<>();
        // figure out how to make a hashmap with boolean values.
        symptomID.put("Loose Stool", 1);
        symptomID.put("Vomiting", 2);
        symptomID.put("Abdominal Cramps", 3);
        symptomID.put("Nausea", 4);
        symptomID.put("Fever", 5);
        symptomID.put("Fatigue", 6);
        symptomID.put("Sore Throat", 7);
        symptomID.put("Aches", 8);
        symptomID.put("Low Appetite", 9);
        symptomID.put("Rash", 10);
        symptomID.put("Swollen Lymph Nodes", 11);
        symptomID.put("Swollen Tonsils", 12);
        symptomID.put("Cough", 13);
        symptomID.put("Chills", 14);
        symptomID.put("Shortness Of Breath", 15);

        // creating array
        List<Integer> diseaseIDList = new ArrayList<>();
        //diseaseIDList.add(2);
        //[] diseaseIDArray= new int [16];
        // see if map contains symptom name

        //Error here, come back, for some reason it is always true

        boolean hasName1 = symptomID.containsKey("Loose Stool");
        if (hasName1 = true) {
            int id = symptomID.get("Loose Stool");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName2 = symptomList.contains("Vomiting");
        if (hasName2 == true) {
            int id = symptomID.get("Vomiting");
            System.out.println(id);
            diseaseIDList.add(id);
        }

        boolean hasName3 = symptomList.contains("Abdominal Cramps");
        if (hasName3 == true) {
            int id = symptomID.get("Abdominal Cramps");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName4 = symptomList.contains("Nausea");
        if (hasName4 == true) {
            int id = symptomID.get("Nausea");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName5 = symptomList.contains("Fever");
        if (hasName5 == true) {
            int id = symptomID.get("Fever");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName6 = symptomList.contains("Fatigue");
        if (hasName6 == true) {
            int id = symptomID.get("Fatigue");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName7 = symptomList.contains("Sore Throat");
        if (hasName7 == true) {
            int id = symptomID.get("Sore Throat");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName8 = symptomList.contains("Aches");
        if (hasName8 == true) {
            int id = symptomID.get("Aches");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName9 = symptomList.contains("Low Appetite");
        if (hasName9 == true) {
            int id = symptomID.get("Low Appetite");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName10 = symptomList.contains("Rash");
        if (hasName10 == true) {
            int id = symptomID.get("Rash");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName11 = symptomList.contains("Swollen Lymph Nodes");
        if (hasName11 == true) {
            int id = symptomID.get("Swollen Lymph Nodes");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName12 = symptomList.contains("Swollen Tonsils");
        if (hasName12 == true) {
            int id = symptomID.get("Swollen Tonsils");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName13 = symptomList.contains("Cough");
        if (hasName13 == true) {
            int id = symptomID.get("Cough");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName14 = symptomList.contains("Chills");
        if (hasName14 == true) {
            int id = symptomID.get("Chills");
            System.out.println(id);
            diseaseIDList.add(id);
        }
        boolean hasName15 = symptomList.contains("Shortness Of Breath");
        if (hasName15 == true) {
            int id = symptomID.get("Shortness Of Breath");
            System.out.println(id);
            diseaseIDList.add(id);
        }

        System.out.println(diseaseIDList);
/*
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


    }
}

