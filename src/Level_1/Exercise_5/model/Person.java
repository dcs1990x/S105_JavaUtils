package Level_1.Exercise_5.model;

import java.io.Serializable;

public class Person implements Serializable {

    private String name, nationality, residence;
    private int age;

    public Person(String name, int age, String nationality, String residence){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.residence = residence;
    }

    public String getName(){return this.name;}

    public int getAge(){return this.age;}

    public String getNationality(){return this.nationality;}

    public String getResidence(){return this.residence;}

    public String toString(){
        return "\nPerson: \n" + "Name = " + this.getName() + System.lineSeparator() +
                "Age = " + this.getAge() + System.lineSeparator() +
                "Nationality = " + this.getNationality() + System.lineSeparator() +
                "Residence = " + this.getResidence();
    }
}