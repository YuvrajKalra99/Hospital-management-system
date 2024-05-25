package com.example;

import java.util.Date;

public class Leaverequest {
    private int requestID;
    private int doctorID;
    private Date startDate;
    private Date endDate;
    private String reason;
    private LeaveRequestState state; 

    public Leaverequest(int requestID, int doctorID, Date startDate, Date endDate, String reason, String pending) {
        this.requestID = requestID;
        this.doctorID = doctorID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.state = (LeaveRequestState) new PendingState(); // Default state
    }

   

    public void setState(LeaveRequestState state) {
        this.state = state;
    }

    public LeaveRequestState getState() {
        return state;
    }

    // Getters and setters for other fields
    public int getRequestID() { // Getter for requestID
        return requestID;
    }

    public void setRequestID(int requestID) { // Setter for requestID
        this.requestID = requestID;
    }

    public int getDoctorID() { // Getter for doctorID
        return doctorID;
    }

    public void setDoctorID(int doctorID) { // Setter for doctorID
        this.doctorID = doctorID;
    }

    public Date getStartDate() { // Getter for startDate
        return startDate;
    }

    public void setStartDate(Date startDate) { // Setter for startDate
        this.startDate = startDate;
    }

    public Date getEndDate() { // Getter for endDate
        return endDate;
    }

    public void setEndDate(Date endDate) { // Setter for endDate
        this.endDate = endDate;
    }

    public String getReason() { // Getter for reason
        return reason;
    }

    public void setReason(String reason) { // Setter for reason
        this.reason = reason;
    }

    public void handleRequest() {
        state.handleRequest(this);
    }
}