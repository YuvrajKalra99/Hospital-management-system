//Implementation for Leave request 
public interface LeaveRequestState {
    void handleRequest(Leaverequest request);
    String getStatus();
}
