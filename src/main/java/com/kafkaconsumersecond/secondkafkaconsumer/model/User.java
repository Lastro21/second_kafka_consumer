package com.kafkaconsumersecond.secondkafkaconsumer.model;

import com.google.common.base.MoreObjects;

public class User {

    private String name;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public User() {
    }

    public User(String name, String dept) {

        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("dept", dept)
                .toString();
    }
}
