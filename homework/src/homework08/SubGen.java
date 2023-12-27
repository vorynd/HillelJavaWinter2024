package homework08;

import java.util.Random;

public class SubGen {

    static String[] cityNames = {"London", "Paris", "Sydney", "Mumbai"};
    static String[] names = {"Emily", "Liam", "Sophia", "Noah", "Olivia", "Jackson", "Ava", "Lucas", "Mia", "Aiden",
            "Isabella", "Ethan", "Harper", "Oliver", "Emma", "Carter", "Sophia", "Mason", "Amelia", "Logan"};
    static String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller",
            "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris",
            "Martin", "Thompson", "Garcia", "Martinez", "Davis"};
    static String[] phoneNumbers = {"+123-456-7890", "+234-567-8901", "+345-678-9012", "+456-789-0123", "+567-890-1234",
            "+678-901-2345", "+789-012-3456", "+890-123-4567", "+901-234-5678", "+012-345-6789", "+123-987-6543",
            "+234-876-5432", "+345-765-4321", "+456-654-3210", "+567-543-2109", "+678-432-1098", "+789-321-0987",
            "+890-210-9876", "+901-098-7654", "+012-987-6543"};
    static String[] contractNumbers = {"1234", "5678", "9012", "3456", "7890", "2345", "6789", "0123", "4567",
            "8901", "4321", "8765", "2109", "6543", "0987", "3210", "7654", "1098", "5432", "9876"};

    public static Subscriber[] generateSubArray() {
        Random random = new Random();
        Subscriber[] array = new Subscriber[20];
        for (int i = 0; i < 20; i++) {
            array[i] = new Subscriber(i + 1, lastNames[i], names[i], cityNames[random.nextInt(4)],
                    phoneNumbers[i], contractNumbers[i], random.nextInt()/1000000,
                    random.nextInt(999), (random.nextInt(2)* random.nextInt(350)), random.nextInt(999));
        }
        return array;
    }
}
