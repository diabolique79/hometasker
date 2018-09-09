package com.hometasker.mk.model;

public class Person {

    private int id;
    private String personName;
    private Task task;

    public Person(String personName){

        this.personName = personName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString(){

        return "Domownik o i mieniu " + personName + " ma za zadanie: " + task +".";
    }
}
