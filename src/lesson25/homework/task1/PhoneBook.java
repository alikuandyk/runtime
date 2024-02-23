package lesson25.homework.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<Contact>> directory = new HashMap<>();

    void addGroup(String groupName) {
        directory.put(groupName, new ArrayList<>());
    }

    void addContactToGroup(String groupName, Contact contact) {
        if (directory.containsKey(groupName)) {
            directory.get(groupName).add(contact);
        } else {
            System.out.println("Такой группы не существует");
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "directory=" + directory +
                '}';
    }
}
