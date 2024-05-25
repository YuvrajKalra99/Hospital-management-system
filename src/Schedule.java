// Record Appointment details
import java.util.List;

public class Schedule {
    private int doctorID;
    private List<AppointmentScheduler> appointments;

    public Schedule(int doctorID, List<AppointmentScheduler> appointments) {
        this.doctorID = doctorID;
        this.appointments = appointments;
    }

    // Getters and setters
    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public List<AppointmentScheduler> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<AppointmentScheduler> appointments) {
        this.appointments = appointments;
    }
}
