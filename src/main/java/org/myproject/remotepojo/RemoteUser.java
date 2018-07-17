package org.myproject.remotepojo;

import java.io.Serializable;

/**
 * Created by zhao_xinhu
 * On 2018/6/27
 */
public class RemoteUser implements Serializable {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RemoteUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public RemoteUser() {
    }

    @Override
    public String toString() {
        return "RemoteUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
