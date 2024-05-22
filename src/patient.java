
public class patient extends person {
    private int age;
    private String address;
    private String gender;
    private int reminderID;
    private int appointmentID;

    public patient(int id, String name, String contactInfo, int age, String address, String gender,
                   int reminderID, int appointmentID) {
        super(id, name, contactInfo);
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.reminderID = reminderID;
        this.appointmentID = appointmentID;
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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
}
