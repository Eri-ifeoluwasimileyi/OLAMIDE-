package Phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
       phoneBook = new PhoneBook();
    }

    @Test
    public void testThatPhonebookCanAddContact() {
        assertEquals("Contact added successfully", phoneBook.addContact("Ola", "Eri", "1234567890"));

        assertThrows(IllegalArgumentException.class, () -> phoneBook.addContact("", "Eri", "1234567890"));
        assertThrows(IllegalArgumentException.class, () -> phoneBook.addContact("Ola", "", "1234567890"));

    }

    @Test
    public void testThatPhonebookCanGetContacts() {
        phoneBook.addContact("Ola", "Eri", "1234567890");
        assertEquals(1, phoneBook.getContacts().size());
    }


    @Test
    public void testThatPhonebookCanRemoveContact() {
        phoneBook.addContact("Ola", "Eri", "1234567890");
        assertEquals("Contact removed successfully", phoneBook.removeContact("1"));
        assertEquals(0, phoneBook.getContacts().size());

        assertThrows(IllegalArgumentException.class, () -> phoneBook.removeContact("Ola"));
        assertThrows(IllegalArgumentException.class, () -> phoneBook.removeContact("2"));

    }

    @Test
    public void testThatPhonebookCanEditContact() {
        phoneBook.addContact("Ola", "Eri", "1234567890");
        phoneBook.addContact("Eri", "Ola", "0901111150");
        assertEquals("Contact updated successfully", phoneBook.editContact("1", "Me", "You", "234561789"));

        assertThrows(IllegalArgumentException.class, () -> phoneBook.editContact("1", "", "You", "234561789"));
        assertThrows(IllegalArgumentException.class, () -> phoneBook.editContact("1", "Me", "You", "only"));
        assertThrows(IllegalArgumentException.class, () -> phoneBook.editContact("3", "Me", "You", "123457689"));
    }

    @Test
    public void testThatPhonebookCanFindContactByPhoneNumber() {
        phoneBook.addContact("Ola", "Eri", "123456789");
        Contact result = phoneBook.findByPhone("123456789");
        assertNotNull(result);
        assertEquals("Ola",  result.getFirstName());

    }

    @Test
    public void testThatPhonebookCanFindByFirstName() {
        phoneBook.addContact("Ola", "Eri", "123456789");
        Contact result = phoneBook.findByFirstName("Ola");
        assertNotNull(result);
        assertEquals("Ola",  result.getFirstName());

    }

    @Test
    public void testThatPhonebookCanFindByLastName() {
        phoneBook.addContact("Ola", "Eri", "123456789");
        Contact result = phoneBook.findByLastName("Eri");
        assertNotNull(result);
        assertEquals("Eri",  result.getLastName());
    }



    
}
