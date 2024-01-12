package homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Homework homework = new Homework();
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller",
                "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris",
                "Martin", "Thompson", "Garcia", "Martinez", "Davis"};
        ArrayList<String> stringList = new ArrayList<>();
        Random random = new Random();
        int rand = random.nextInt(80);
        for (int i = 0; i < 20 + rand; i++) {
            stringList.add(lastNames[random.nextInt(20)]);
        }
        System.out.println(stringList.size());

        System.out.println("String occured " + homework.countOccurance(stringList, "Martinez") + " times");
        List<String> stringList2 = homework.toList(lastNames);

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 20 + rand; i++) {
            intList.add(random.nextInt(12));
        }
        System.out.println(intList);
        System.out.println(homework.findUnique(intList));
        homework.calcOccurance(stringList);
        System.out.println(homework.findOccurance(stringList));

    }
}
