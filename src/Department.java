
public class Department {
    private int departmentID;
    private String name;
    private String description;

    public Department(int departmentID, String name, String description) {
        this.departmentID = departmentID;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
