package lesson25.homework.task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Contact contact1 = new Contact("name1", 1);
        Contact contact2 = new Contact("name2", 2);
        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.addGroup("group1");
        phoneBook1.addContactToGroup("group1", contact1);
        phoneBook1.addContactToGroup("group1", contact2);

        System.out.println(phoneBook1);
    }
}
