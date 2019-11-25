package user;

import book.Book;

import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList<Book> books;

    public Student(String studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
}
