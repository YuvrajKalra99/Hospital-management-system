public class PendingState implements LeaveRequestState {

    public PendingState() {
    }
    @Override
    public void handleRequest(Leaverequest request) {
        
        System.out.println("Handling request in pending state.");
    }

    @Override
    public String getStatus() {
        return "Pending";
    }
}
