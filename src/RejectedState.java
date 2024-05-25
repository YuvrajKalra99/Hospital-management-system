public class RejectedState implements LeaveRequestState {
    @Override
    public void handleRequest(Leaverequest request) {
        
        System.out.println("Handling request in rejected state. No further action can be taken.");
    }

    @Override
    public String getStatus() {
        return "Rejected";
    }
}
