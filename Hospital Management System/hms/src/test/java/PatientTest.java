import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.patientrecord;

public class PatientTest {
    private patientrecord record;
    private Date dateScheduled;
    private Date timeScheduled;
    private Date billingDate;

    @BeforeEach
    public void setUp() {
        dateScheduled = new Date();
        timeScheduled = new Date();
        billingDate = new Date();
        record = new patientrecord(1, 201, 301, dateScheduled, timeScheduled, "Initial record", 401, 150.0, billingDate);
    }

    @Test
    public void testInitialRecordDetails() {
        assertEquals(1, record.getPatientID());
        assertEquals(201, record.getAppointmentSchedulerID());
        assertEquals(301, record.getAppointmentID());
        assertEquals(dateScheduled, record.getDateScheduled());
        assertEquals(timeScheduled, record.getTimeScheduled());
        assertEquals("Initial record", record.getRecord());
        assertEquals(401, record.getBillingID());
        assertEquals(150.0, record.getAmountBilled(), 0.001);
        assertEquals(billingDate, record.getBillingDate());
    }

    @Test
    public void testUpdateRecordDetails() {
        record.setRecord("Updated record");
        assertEquals("Updated record", record.getRecord());
    }

    @Test
    public void testUpdateBillingDetails() {
        record.setAmountBilled(200.0);
        assertEquals(200.0, record.getAmountBilled(), 0.001);
    }

    @Test
    public void testUpdateDateScheduled() {
        Date newDateScheduled = new Date(dateScheduled.getTime() + (1000 * 60 * 60 * 24)); // 1 day later
        record.setDateScheduled(newDateScheduled);
        assertEquals(newDateScheduled, record.getDateScheduled());
    }

    @Test
    public void testUpdateTimeScheduled() {
        Date newTimeScheduled = new Date(timeScheduled.getTime() + (1000 * 60 * 60)); // 1 hour later
        record.setTimeScheduled(newTimeScheduled);
        assertEquals(newTimeScheduled, record.getTimeScheduled());
    }
}
