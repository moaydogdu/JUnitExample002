import org.example.courserecord.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName("Test every student must have an id, name and surname")
    void shouldCreateStudentWithIdNameAndSurname() {
        /**
         * Assertions.*
         * assertEquals
         * assertEquals with message
         * assertNotEquals
         * assertTrue with lazily evaluated message
         * assertFalse with boolean supplier
         * assertNull
         * assertNotNull
         * assertArrayEquals
         * assertSame
         */

        Student muhammet = new Student("1", "Muhammet Oğuzhan", "AYDOĞDU");

        assertEquals("Muhammet Oğuzhan", muhammet.getName());
        assertEquals("Muhammet Oğuzhan", muhammet.getName(), "Student's name");
        assertNotEquals("Muhammet Oguzhan", muhammet.getName(), "Student's name");

        assertTrue(muhammet.getName().startsWith("M"));
        assertTrue(muhammet.getName().startsWith("M"), () -> "Student's name " + "starts with M");
        //Yukarıdaki satırdaki string ifadenin lambda yazılma sebebi String ifadenin lazy bir şekilde oluşturulması.
        //Yani eğer hata fırlatılırsa, o zaman ilgili string'i oluşturuyor.
        assertFalse(
                () -> {
                    Student nurettin = new Student("id1", "Nurettin", "BAŞTÜRK");
                    return nurettin.getName().endsWith("X");
                },
                () -> "Student's name " + "ends with X"
        );

        final Student nazif = new Student("2","Nazif Can","KABLAN");

        assertArrayEquals(new String[]{"Muhammet Oğuzhan","Nazif Can"}, Stream.of(muhammet,nazif).map(Student::getName).toArray());

        Student student = muhammet;

        assertSame(muhammet,student);
        assertNotSame(nazif,student);
    }


}
