package library;

import book.Book;
import book.BookShelf;
import user.Student;

import java.util.ArrayList;

public class Library {
    private ArrayList<Student> students;
    public int numberOfBooks;
    public BookShelf bookshelf;

    public Library() {
        this.students = new ArrayList<>();
        this.bookshelf = new BookShelf();
    }

    public BookShelf getBookshelf(String bookId) {
        return bookshelf;
    }

    public Book getBook(String bookId) {
        return bookshelf.getBook(bookId);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void rentBook(String bookId, String studentId) {
        Book b = getBook(bookId);
        if(b == null) System.out.println("no books with this id");

        Student s = getStudent(studentId);
        if(s == null) System.out.println("no students with this id");

        this.bookshelf.rentBook(b, s);
    }
    public void returnBook(String bookId, String studentId, String bookName) {
        Student s = getStudent(studentId);
        Book b = new Book(bookId, bookName);
        this.bookshelf.returnBook(b, s);
    }

    public Student getStudent(String studentId) {
        for(Student student: students) {
            if(student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public boolean isRented(String bookId, String studentId) {
        Student s = getStudent(studentId);
        if(s == null) return false;
        
        Book b = getBook(bookId);
        if(b != null) return false;
        
        if(s.getBook(bookId)== null) return false;
        else return true;
    }

    public boolean isValidStudent(String studentId) {
        return (getStudent(studentId) != null);
    }

    public void addBook(String bookId, String title) {
        bookshelf.addBook(new Book(bookId, title));
    }

    public void addStudent(String studentId, String name) {
        students.add(new Student(studentId, name));
    }
}
