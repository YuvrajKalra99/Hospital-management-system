import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoctorTest {

    @Test
    void testDoctorName() {
        medicalstaff doctor = new medicalstaff(1, "Dr. Smith", "Cardiology", "1234567890", "MD", 10, 101);
        Assertions.assertEquals("Dr. Smith", doctor.getName());
    }

    @Test
    void testDoctorSpecialization() {
        medicalstaff doctor = new medicalstaff(1, "Dr. Smith", "Cardiology", "1234567890", "MD", 10, 101);
        Assertions.assertEquals("Cardiology", doctor.getSpecialization());
    }

    @Test
    void testDoctorContactInfo() {
        medicalstaff doctor = new medicalstaff(1, "Dr. Smith", "Cardiology", "1234567890", "MD", 10, 101);
        Assertions.assertEquals("1234567890", doctor.getContactInfo());
    }

    @Test
    void testDoctorQualifications() {
        medicalstaff doctor = new medicalstaff(1, "Dr. Smith", "Cardiology", "1234567890", "MD", 10, 101);
        Assertions.assertEquals("MD", doctor.getQualifications());
    }

    @Test
    void testDoctorExperience() {
        medicalstaff doctor = new medicalstaff(1, "Dr. Smith", "Cardiology", "1234567890", "MD", 10, 101);
        Assertions.assertEquals(10, doctor.getExperience());
    }
}
