import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Create a medical staff member
        medicalstaff doctor = new medicalstaff(1, "Dr. Smith", "Cardiology", "1234567890", "MD", 10, 101);

        // Create a department
        Department cardiology = new Department(101, "Cardiology", "Handles heart-related issues");

        // Create a patient
        patient johnDoe = new patient(101, "John Doe", "0987654321", 30, "123 Street", "Male", 201, 301);

        // Create a patient record
        patientrecord johnRecord = new patientrecord(
            101,
            201,
            301,
            new Date(System.currentTimeMillis()),
            new Time(System.currentTimeMillis()),
            "Record of John Doe",
            401,
            100.50,
            new Date(System.currentTimeMillis())
        );

        // Create an appointment scheduler
        AppointmentScheduler scheduler = new AppointmentScheduler(
            501,
            301,
            101, // patientID
            1,   // doctorID
            new Date(System.currentTimeMillis()),
            new Date(System.currentTimeMillis()),
            "Consultation"
        );

        // Create a reminder
        Reminder reminder = new Reminder(
            601,
            301,
            LocalDateTime.now().plusDays(1),
            "Reminder: Appointment with Dr. Smith"
        );

        // Create a schedule for the doctor
        List<AppointmentScheduler> appointments = new ArrayList<>();
        appointments.add(scheduler);
        Schedule doctorSchedule = new Schedule(1, appointments);

        // Create a leave request for the doctor
        Leaverequest leaveRequest = new Leaverequest(701, 1, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 86400000L), "Vacation", "Pending");

        // Display information
        System.out.println("Medical Staff Information:");
        System.out.println("Name: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Qualifications: " + doctor.getQualifications());
        System.out.println("Department ID: " + doctor.getDepartmentID());
        System.out.println();

        System.out.println("Department Information:");
        System.out.println("Department Name: " + cardiology.getName());
        System.out.println("Department Description: " + cardiology.getDescription());
        System.out.println();

        System.out.println("Patient Information:");
        System.out.println("Name: " + johnDoe.getName());
        System.out.println("Age: " + johnDoe.getAge());
        System.out.println("Gender: " + johnDoe.getGender());
        System.out.println("Address: " + johnDoe.getAddress());
        System.out.println("Contact Info: " + johnDoe.getContactInfo());
        System.out.println("Appointment ID: " + johnDoe.getAppointmentID());
        System.out.println("Reminder ID: " + johnDoe.getReminderID());
        System.out.println();

        System.out.println("Patient Record Information:");
        System.out.println("Patient ID: " + johnRecord.getPatientID());
        System.out.println("Appointment ID: " + johnRecord.getAppointmentID());
        System.out.println("Record: " + johnRecord.getRecord());
        System.out.println("Amount Billed: " + johnRecord.getAmountBilled());
        System.out.println("Billing Date: " + johnRecord.getBillingDate());
        System.out.println();

        System.out.println("Appointment Scheduler Information:");
        System.out.println("Appointment Scheduler ID: " + scheduler.getAppointmentSchedulerID());
        System.out.println("Appointment ID: " + scheduler.getAppointmentID());
        System.out.println("Date Scheduled: " + scheduler.getDateScheduled());
        System.out.println("Time Scheduled: " + scheduler.getTimeScheduled());
        System.out.println("Patient ID: " + scheduler.getPatientID());
        System.out.println("Doctor ID: " + scheduler.getDoctorID());
        System.out.println("Reason: " + scheduler.getReason());
        System.out.println();

        System.out.println("Reminder Information:");
        System.out.println("Reminder ID: " + reminder.getReminderID());
        System.out.println("Appointment ID: " + reminder.getAppointmentID());
        System.out.println("Reminder Date and Time: " + reminder.getReminderDateTime());
        System.out.println("Message: " + reminder.getMessage());
        System.out.println();

        System.out.println("Schedule Information:");
        System.out.println("Doctor ID: " + doctorSchedule.getDoctorID());
        System.out.println("Appointments: ");
        for (AppointmentScheduler appt : doctorSchedule.getAppointments()) {
            System.out.println(" - Appointment ID: " + appt.getAppointmentID());
            System.out.println("   Patient ID: " + appt.getPatientID());
            System.out.println("   Doctor ID: " + appt.getDoctorID());
            System.out.println("   Date: " + appt.getDateScheduled());
            System.out.println("   Time: " + appt.getTimeScheduled());
            System.out.println("   Reason: " + appt.getReason());
        }
        System.out.println();

        System.out.println("Leave Request Information:");
        System.out.println("Request ID: " + leaveRequest.getRequestID());
        System.out.println("Doctor ID: " + leaveRequest.getDoctorID());
        System.out.println("Start Date: " + leaveRequest.getStartDate());
        System.out.println("End Date: " + leaveRequest.getEndDate());
        System.out.println("Reason: " + leaveRequest.getReason());
     
    }
}
