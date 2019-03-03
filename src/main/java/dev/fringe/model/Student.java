package dev.fringe.model;

public class Student {
    private Integer id;

    private String name;

    private String passportNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber == null ? null : passportNumber.trim();
    }

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", passportNumber=" + passportNumber + "]";
	}
}