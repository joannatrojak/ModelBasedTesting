package user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student studentTester = new Student();

    @Test
    public void shouldReturnDefaultStudent(){
        assertEquals("Name", studentTester.getName());
        assertEquals("00000000000000", studentTester.getStudentId());
    }
    @Test
    public void shouldReturnStudentFromTheConstructor(){
        Student studentTester2 = new Student("00000000000002", "John Brown");
        assertEquals("John Brown", studentTester2.getName());
        assertEquals("00000000000002", studentTester2.getStudentId());
    }
    @Test
    public void shouldReturnStudent(){
        studentTester.setName("John Smith");
        studentTester.setStudentId("00000000000001");
        assertEquals("John Smith", studentTester.getName());
        assertEquals("00000000000001", studentTester.getStudentId());
    }
}