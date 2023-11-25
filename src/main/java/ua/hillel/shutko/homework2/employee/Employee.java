package ua.hillel.shutko.homework2.employee;

public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final int phoneNumber;
    private final int age;

    public Employee(String fullName, String position, String email, int phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
