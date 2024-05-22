import java.util.Date;

public class patientrecord{
    private int patientID;
    private int appointmentSchedulerID;
    private int appointmentID;
    private Date dateScheduled;
    private Date timeScheduled;
    private String record;
    private int billingID;
    private double amountBilled;
    private Date billingDate;

    public patientrecord(int patientID, int appointmentSchedulerID, int appointmentID, Date dateScheduled,
                         Date timeScheduled, String record, int billingID, double amountBilled, Date billingDate) {
        this.patientID = patientID;
        this.appointmentSchedulerID = appointmentSchedulerID;
        this.appointmentID = appointmentID;
        this.dateScheduled = dateScheduled;
        this.timeScheduled = timeScheduled;
        this.record = record;
        this.billingID = billingID;
        this.amountBilled = amountBilled;
        this.billingDate = billingDate;
    }

    // Getters and setters
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getAppointmentSchedulerID() {
        return appointmentSchedulerID;
    }

    public void setAppointmentSchedulerID(int appointmentSchedulerID) {
        this.appointmentSchedulerID = appointmentSchedulerID;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getDateScheduled() {
        return dateScheduled;
    }

    public void setDateScheduled(Date dateScheduled) {
        this.dateScheduled = dateScheduled;
    }

    public Date getTimeScheduled() {
        return timeScheduled;
    }

    public void setTimeScheduled(Date timeScheduled) {
        this.timeScheduled = timeScheduled;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public int getBillingID() {
        return billingID;
    }

    public void setBillingID(int billingID) {
        this.billingID = billingID;
    }

    public double getAmountBilled() {
        return amountBilled;
    }

    public void setAmountBilled(double amountBilled) {
        this.amountBilled = amountBilled;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }
}