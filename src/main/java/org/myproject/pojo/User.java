package org.myproject.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private int id;

    private String firstName;

    private String lastName;

    private String password;

    private int age;

    public User() {
    }

    public User(int id, String firstName, String lastName, String password, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.age = age;
    }

    public User(String firstName, String lastName, String password, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
