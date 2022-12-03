import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public record Disease(String name, int[] symptoms, int[] weights) {
    public boolean hasSymptom(int id) {
        for (int symptomId : symptoms) {
            if (symptomId == id) return true;
        }

        return false;
    }

    public int symptomWeight(int id) {
        for (int i = 0; i < symptoms.length; i++) {
            if (symptoms[i] == id) {
                return weights[i];
            }
        }
        return -1;
    }
}