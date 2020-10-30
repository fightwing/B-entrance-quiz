package com.thoughtworks.capability.gtb.entrancequiz.Dto;

//TODO GTB-知识点: - Member.java:3 Member与Team应该属于entity
//TODO GTB-知识点: * 加深对DTO的理解，考虑一下什么情况下才需要引入DTO
//TODO GTB-知识点: * 了解下Lombok
public class Member {

    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

}
