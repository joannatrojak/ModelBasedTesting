package book;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book bookTester = new Book();

    @Test
    public void shouldReturnDefaultBook(){
        assertEquals("00000000000000", bookTester.getBookId());
        assertEquals("title", bookTester.getTitle());
        assertEquals("author", bookTester.getAuthor());
    }
    @Test
    public void shouldReturnStudentFromTheConstructor(){
        Book bookTester2 = new Book("00000000000002", "1984", "George Orwell");
        assertEquals("00000000000002", bookTester2.getBookId());
        assertEquals("1984", bookTester2.getTitle());
        assertEquals("George Orwell", bookTester2.getAuthor());
    }
    @Test
    public void shouldReturnBook(){
        bookTester.setBookId("00000000000001");
        bookTester.setTitle("Pride and Prejudice");
        bookTester.setAuthor("Jane Austen");
        assertEquals("00000000000001", bookTester.getBookId());
        assertEquals("Pride and Prejudice", bookTester.getTitle());
        assertEquals("Jane Austen", bookTester.getAuthor());
    }

}