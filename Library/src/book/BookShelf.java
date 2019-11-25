package book;

import user.Student;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf(){
        this.books = new ArrayList<>();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book getBook(String name) {
        for(Book book: books) {
            if(book.getTitle().equals(name)) {
                return book;
            }
        }

        return null;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void rentBook(Book book, Student student) {
        student.addBook(book);
        removeBook(book);
    }

    public void returnBook(Book book, Student student) {
        student.removeBook(book);
        addBook(book);
    }
}
