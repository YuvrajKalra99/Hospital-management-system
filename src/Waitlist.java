import java.util.Date;

public class Waitlist {
    private int waitlistID;
    private int patientID;
    private Date dateAdded;
    private String status;

    public Waitlist(int waitlistID, int patientID, Date dateAdded, String status) {
        this.waitlistID = waitlistID;
        this.patientID = patientID;
        this.dateAdded = dateAdded;
        this.status = status;
    }

    // Getters and setters
    public int getWaitlistID() {
        return waitlistID;
    }

    public void setWaitlistID(int waitlistID) {
        this.waitlistID = waitlistID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
