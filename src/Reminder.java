import java.time.LocalDateTime;

public class Reminder {
    private int reminderID;
    private int appointmentID;
    private LocalDateTime reminderDateTime;
    private String message;

    public Reminder(int reminderID, int appointmentID, LocalDateTime reminderDateTime, String message) {
        this.reminderID = reminderID;
        this.appointmentID = appointmentID;
        this.reminderDateTime = reminderDateTime;
        this.message = message;
    }

    // Getters and setters
    public int getReminderID() {
        return reminderID;
    }

    public void setReminderID(int reminderID) {
        this.reminderID = reminderID;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
