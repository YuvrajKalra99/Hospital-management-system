package com.example;

public class medicalstaff extends person {
    private String specialization;
    private String qualifications;
    private int experienceYears;
    private int departmentID;

    public medicalstaff(int id, String name, String contactInfo, String specialization, String qualifications,
                        int experienceYears, int departmentID) {
        super(id, name, contactInfo);
        this.specialization = specialization;
        this.qualifications = qualifications;
        this.experienceYears = experienceYears;
        this.departmentID = departmentID;
    }

    // Getters and setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public short getExperience() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
