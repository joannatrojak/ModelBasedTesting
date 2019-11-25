package library;

import book.Book;
import org.junit.jupiter.api.Test;
import user.Student;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Student studentTester = new Student("00000000000002", "John Brown");
    Account accountTester = new Account(studentTester);
    Book bookTester = new Book();
    @Test
    public void shouldReturnAccountBeforeAddingAnyBooks(){
        assertEquals("00000000000002", accountTester.getStudentId());
        assertEquals(0, accountTester.getNumberOfBooks());
        assertEquals(0, accountTester.getBooks().size());
    }
    @Test
    public void shouldAddBookIntoAccount(){
        accountTester.addBookToAccount("00000000000002", "1984", "George Orwell");
        accountTester.books.add(new Book("00000000000002", "1984", "George Orwell"));
        assertEquals(1, accountTester.getBooks().size());
        //assertEquals("1984", accountTester.getBooks().get(0).getTitle());
    }
}