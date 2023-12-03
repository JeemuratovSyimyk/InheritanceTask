package org.example.Entity;

public class Phone extends NoteBook{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone(String name, String brand, int age, String model) {
        super(name, brand, age);

    }
    public void getPhone(){
        System.out.println(model+ "This is model");
    }
    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}
