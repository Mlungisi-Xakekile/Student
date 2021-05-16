package za.ac.mycput.Mlungisi;

import java.util.*;

public class Student {

    public String StudName;
    public List<Integer> StudNumber;
    public Set<Integer> Age;
    public Map<String, String> course;

    public Student(String firstName,Integer StudNumber,Integer Age,  String lastName) {

    }

    public  void setStudName(String studName) {
        StudName = studName;

    }

    public void setStudNumber(List<Integer> studNumber) {
        StudNumber = studNumber;

    }

    public void setAge(Set<Integer> age) {
        Age = age;

    }

    public void setCourse(Map<String, String> course) {
        this.course = course;

    }

    public String getStudName() {
        return StudName;
    }

    public List<Integer> getStudNumber() {
        return StudNumber;
    }

    public Set<Integer> getAge() {
        return Age;
    }

    public Map<String, String> getCourse() {
        return course;
    }
}
