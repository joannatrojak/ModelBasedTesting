package library;

import book.Book;
import book.BookShelf;
import user.Student;

import java.util.ArrayList;

public class Account {
    private ArrayList<Student> students;
    public int numberOfBooks;
    public BookShelf bookshelf;
    public int limit;

    public Account() {
        this.students = new ArrayList<>();
        this.bookshelf = new BookShelf();
    }

    public BookShelf getBookshelf(String name) {
        return bookshelf;
    }

    public Book getBook(String name) {
        return bookshelf.getBook(name);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void buyCarFromStand(String book, String student) {
        Book b = getBook(book);
        Student s = getStudents(student);
        limit();
    }

    public Student getStudents(String name) {
        for(Student student: students) {
            if(student.getName().equals(name)) {
                return student;
            }
        }

        return null;
    }
    public void addBook(String bookId, String title, String author) {
        bookshelf.addBook(new Book(bookId, title, author));
    }

    public void addStudent(String studentId, String name) {
        students.add(new Student(studentId, name));
    }
    public void limit(){
        limit++;
    }

}
