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
        symptomID.put("Swollen lymph nodes", 2);
        symptomID.put("Swollen tonsils", 3);
        symptomID.put("Cough", 1);
        symptomID.put("Chills", 2);
        symptomID.put("Shortness of breath", 3);


        // see if map contains symptom name
        boolean hasName = symptomID.containsKey("Chills");
        if (hasName = true) {
            add
        }
        // get value for a specific key
        int id = symptomID.get("Chills");

    }
}