package com.example.messagingrabbitmq;

import java.io.Serializable;

public class SimpleMessage implements Serializable {
    private String name;
    private String desc;

    public SimpleMessage() {
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
