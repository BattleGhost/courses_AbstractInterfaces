package org.example.car;

public class Human implements HumanDriver {
    private String name;
    private int age;
    private String occupation;
    private int workExperience;
    private int passportId;

    public Human() {
    }

    public Human(String name, int age, String occupation, int workExperience, int passportId) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.workExperience = workExperience;
        this.passportId = passportId;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public int workExperience() {
        return workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
}
