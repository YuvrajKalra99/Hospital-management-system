package com.example;

public interface LeaveRequestState {
    void handleRequest(Leaverequest request);
    String getStatus();
}
