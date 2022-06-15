package HASH_MAP_QUESTIONS;

import javax.sound.midi.MidiFileFormat;
import java.util.HashMap;

public class _3_Common_Element {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 5};
        int[] array = {1, 1, 1, 2, 2, 5};

        HashMap<Integer, Integer> key = new HashMap<>();

        for (int var : arr) {

            if (key.containsKey(var)) {
                int temp = key.get(var);
                temp++;
                key.put(var, temp);

            } else {
                key.put(var, 1);
            }
        }

        for (int var : array) {

            if (key.containsKey(var) && key.get(var) > 0) {

                System.out.println(var);
                int temp = key.get(var);
                temp--;
                key.put(var, temp);
            }
        }
    }
}
