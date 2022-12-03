import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public record Symptom(String name, int id) {
    private static final HashMap<Integer, Symptom> symptomList = new HashMap<>();

    public Symptom(String name, int id) {
        this.name = name;
        this.id = id;

        symptomList.put(id, this);
    }

    public static Symptom getSymptom(int id) {
        return symptomList.get(id);
    }

    public static @Nullable Symptom getSymptom(String name) {
        for (Symptom symptom : symptomList.values()) {
            if (symptom.name.equals(name)) {
                return symptom;
            }
        }

        return null;
    }
}
