package homework11.phonebook;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller",
                "Wilson", "Moore", "Taylor", "Anderson"};
        String[] phoneNumbers = {"+123-456-7890", "+234-567-8901", "+345-678-9012", "+456-789-0123", "+567-890-1234",
                "+678-901-2345", "+789-012-3456", "+890-123-4567", "+901-234-5678", "+012-345-6789", "+123-987-6543",
                "+234-876-5432", "+345-765-4321", "+456-654-3210", "+567-543-2109", "+678-432-1098", "+789-321-0987",
                "+890-210-9876", "+901-098-7654", "+012-987-6543"};

        Phonebook phonebook = new Phonebook();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            phonebook.add(lastNames[random.nextInt(11)],phoneNumbers[i] );
        }
        System.out.println(phonebook.find("Johnson"));
        System.out.println(phonebook.findAll("Williams"));
        System.out.println(phonebook.find("Jo"));
        System.out.println(phonebook.findAll("Wil"));
    }
}
