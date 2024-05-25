public class ApprovedState implements LeaveRequestState {
    @Override
    public void handleRequest(Leaverequest request) {
        System.out.println("Handling request in approved state.");
      
    }

    @Override
    public String getStatus() {
        return "Approved";
    }
}
