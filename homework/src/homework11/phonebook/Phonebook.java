package homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Entry> entries = new ArrayList<>();


    public void add(String name, String phoneNum) {
        entries.add(new Entry(name, phoneNum));
    }

    public Entry find(String name) {
        if (name != null) {
            for (Entry entry : entries) {
                if (name.equals(entry.getName())) {
                    return entry;
                }
            }
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        ArrayList<Entry> result = new ArrayList<>();
        if (name != null) {
            entries.forEach(entry -> {
                if (name.equals(entry.getName())) {
                    result.add(entry);
                }
            });
        }
        return result;
    }

    public void showAll() {
        System.out.println(entries);
    }
}
