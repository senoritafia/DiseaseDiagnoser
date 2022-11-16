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
        symptomID.put("Swollen lymph nodes", 12);
        symptomID.put("Swollen tonsils", 13);
        symptomID.put("Cough", 14);
        symptomID.put("Chills", 15);
        symptomID.put("Shortness of breath", 16);

// creating array
        int[] diseaseIDArray= new int [16];
        // see if map contains symptom name

        //Error here, come back, for some reason it is always true

        boolean hasName1 = symptomID.containsKey("Loose Stool");
        if (hasName1 = true) {
            int id = symptomID.get("Loose Stool");
            System.out.println(id);



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



    }
}
