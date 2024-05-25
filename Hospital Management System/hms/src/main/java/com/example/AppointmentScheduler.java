package com.example;

import java.util.Date;

public class AppointmentScheduler {
    private static AppointmentScheduler instance; // Static instance variable
    private int appointmentSchedulerID;
    private int appointmentID;
    private int patientID;
    private int doctorID;
    private Date dateScheduled;
    private Date timeScheduled;
    private String reason;

    // Private constructor to prevent instantiation from outside
    private AppointmentScheduler() {
    }

    // Static method to get the singleton instance
    public static AppointmentScheduler getInstance() {
        if (instance == null) {
            instance = new AppointmentScheduler();
        }
        return instance;
    }

    public AppointmentScheduler(int appointmentSchedulerID, int appointmentID, int patientID, int doctorID, Date dateScheduled, Date timeScheduled, String reason) {
        this.appointmentSchedulerID = appointmentSchedulerID;
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.dateScheduled = dateScheduled;
        this.timeScheduled = timeScheduled;
        this.reason = reason;
    }

    // Getters and setters
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

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

