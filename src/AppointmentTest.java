// 5 unit test for appointment 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AppointmentTest {

    @Test
    void testAppointmentReason() {
        AppointmentScheduler scheduler = new AppointmentScheduler(
                501,
                301,
                101, // patientID
                1,   // doctorID
                new Date(System.currentTimeMillis()),
                new Date(System.currentTimeMillis()),
                "Consultation"
        );
        Assertions.assertEquals("Consultation", scheduler.getReason());
    }

    @Test
    void testAppointmentDoctorID() {
        AppointmentScheduler scheduler = new AppointmentScheduler(
                501,
                301,
                101, // patientID
                1,   // doctorID
                new Date(System.currentTimeMillis()),
                new Date(System.currentTimeMillis()),
                "Consultation"
        );
        Assertions.assertEquals(1, scheduler.getDoctorID());
    }

    @Test
    void testAppointmentPatientID() {
        AppointmentScheduler scheduler = new AppointmentScheduler(
                501,
                301,
                101, // patientID
                1,   // doctorID
                new Date(System.currentTimeMillis()),
                new Date(System.currentTimeMillis()),
                "Consultation"
        );
        Assertions.assertEquals(101, scheduler.getPatientID());
    }

    @Test
    void testAppointmentDateScheduled() {
        Date currentDate = new Date(System.currentTimeMillis());
        AppointmentScheduler scheduler = new AppointmentScheduler(
                501,
                301,
                101, // patientID
                1,   // doctorID
                currentDate,
                new Date(System.currentTimeMillis()),
                "Consultation"
        );
        Assertions.assertEquals(currentDate, scheduler.getDateScheduled());
    }

    @Test
    void testAppointmentTimeScheduled() {
        Date currentTime = new Date(System.currentTimeMillis());
        AppointmentScheduler scheduler = new AppointmentScheduler(
                501,
                301,
                101, // patientID
                1,   // doctorID
                new Date(System.currentTimeMillis()),
                currentTime,
                "Consultation"
        );
        Assertions.assertEquals(currentTime, scheduler.getTimeScheduled());
    }
}
