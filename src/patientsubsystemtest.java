import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.sql.Date;
import java.sql.Time;

public class  patientsubsystemtest {

    private medicalstaff medicalStaff;
    private patient patient;
    private patientrecord patientRecord;

    @BeforeEach
    public void setUp() {
        medicalStaff = new medicalstaff(1, "Dr. Smith", "1234567890", "Cardiology", "MD", 10, 101);
        patient = new patient(101, "John Doe", "0987654321", 30, "123 Street", "Male", 201, 301);
        patientRecord = new patientrecord(101, 201, 301, new Date(System.currentTimeMillis()), new Time(System.currentTimeMillis()), "Record", 401, 100.50, new Date(System.currentTimeMillis()));
    }

    @Test
    public void testMedicalStaffSpecialization() {
        assertEquals("Cardiology", medicalStaff.getSpecialization());
    }

    @Test
    public void testMedicalStaffQualifications() {
        assertEquals("MD", medicalStaff.getQualifications());
    }

    @Test
    public void testMedicalStaffDepartmentID() {
        assertNotEquals(0, medicalStaff.getDepartmentID());
    }

    @Test
    public void testPatientAge() {
        assertTrue(patient.getAge() > 0);
    }

    @Test
    public void testPatientGender() {
        assertNotNull(patient.getGender());
    }

    @Test
    public void testPatientAppointmentID() {
        assertNotNull(patient.getAppointmentID());
    }

    @Test
    public void testPatientRecordAmountBilled() {
        assertEquals(100.50, patientRecord.getAmountBilled(), 0.01);
    }

    @Test
    public void testPatientRecordDateScheduled() {
        assertNotNull(patientRecord.getDateScheduled());
    }

    @Test
    public void testPatientRecordBillingID() {
        assertNotSame(0, patientRecord.getBillingID());
    }

    @Test
    public void testPatientRecordRecordNotNull() {
        assertNotNull(patientRecord.getRecord());
    }

    @Test
    public void testPatientRecordTimeScheduled() {
        assertNotNull(patientRecord.getTimeScheduled());
    }

    @Test
    public void testPatientRecordBillingDate() {
        assertNotNull(patientRecord.getBillingDate());
    }

    @Test
    public void testPatientRecordAppointmentID() {
        assertNotEquals(0, patientRecord.getAppointmentID());
    }

    @Test
    public void testPatientRecordAppointmentSchedulerID() {
        assertNotEquals(0, patientRecord.getAppointmentSchedulerID());
    }

    @AfterEach
    public void tearDown() {
        medicalStaff = null;
        patient = null;
        patientRecord = null;
    }
}