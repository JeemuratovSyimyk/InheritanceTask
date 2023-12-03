package org.example.Entity;

public class NoteBook {
    private String name;
    private String Brand;
    private int age;

    public NoteBook(String name, String brand, int age) {
        this.name = name;
        Brand = brand;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getNoteBook(){
        System.out.println(name+ " This is name " +Brand + " This is name " +age+ " This is the year of the laptop ");
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", Brand='" + Brand + '\'' +
                ", age=" + age +
                '}';
    }
}
