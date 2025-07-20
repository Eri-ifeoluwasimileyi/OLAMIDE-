package Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();



    public String addContact(String firstName, String lastName, String phoneNumber) {
        if (firstName.isEmpty() || lastName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        if (!isDigit(phoneNumber))
            throw new IllegalArgumentException("Phone number must be only digits");

        contacts.add(new Contact(firstName, lastName, phoneNumber));
        return "Contact added successfully";
    }

    private boolean isDigit(String digits) {
        if (digits.isEmpty())
            return false;
        for (int index = 0; index < digits.length(); index++) {
            char c = digits.charAt(index);
            if (c < '0' || c > '9')
                return false;
        }
        return true;
    }

    public String removeContact(String number) {
        if (!isDigit(number))
            throw new IllegalArgumentException("Invalid input");

        int index = Integer.parseInt(number);
        if (index < 1 || index > contacts.size())
            throw new IllegalArgumentException("Contact not found");

        contacts.remove(index - 1);
        return "Contact removed successfully";
    }

    public String editContact(String number, String newFirstName, String newLastName, String newPhoneNumber) {
        if (newFirstName.isEmpty() || newLastName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");

        if (!isDigit(number))
            throw new IllegalArgumentException("Invalid input");

        if (!isDigit(newPhoneNumber))
            throw new IllegalArgumentException("Phone number must be only digits");

        int index = Integer.parseInt(number);
        if (index < 1 || index > contacts.size())
            throw new IllegalArgumentException("Contact not found");

        Contact contact = contacts.get(index - 1);
        contact.setFirstName(newFirstName);
        contact.setLastName(newLastName);
        contact.setPhoneNumber(newPhoneNumber);
        return "Contact updated successfully";

    }

    public Contact findByPhone(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phone))
                return contact;
        }
        return null;
    }

    public Contact findByFirstName(String firstName) {
        if (firstName.isEmpty())
            return null;
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName))
                return contact;
        }
        return null;
    }

    public Contact findByLastName(String lastName) {
        if (lastName.isEmpty())
            return null;
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName))
                return contact;
        }
        return null;
    }

    public List<Contact> getContacts() {

        return contacts;
    }
}
