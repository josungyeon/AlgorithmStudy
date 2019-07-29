package hackerank;

import java.util.*;

/**
 *
 Hash Tables: Ransom Note

 * Created by sungyeonjo on 2019. 6. 6..
 */
public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for (int i = 0; i < magazine.length; i++) {
            magMap.put(magazine[i], 1);
        }

        for (int i = 0; i < note.length; i++) {
            noteMap.put(note[i], noteMap.getOrDefault(note[i], 0) + 1);
        }

        for (int i = 0; i < note.length; i++) {
            Integer a = magMap.getOrDefault(note[i], 0) - noteMap.getOrDefault(note[i], 0);
            if (a != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        checkMagazine(magazine, note);
        System.out.println("\n");

        String[] magazine2 = {"two", "times", "three", "is", "not", "four"};
        String[] note2 = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine2, note2);
        System.out.println("\n");

        String[] magazine3 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note3 = {"ive", "got", "some", "coconuts"};

        checkMagazine(magazine3, note3);
    }
}
