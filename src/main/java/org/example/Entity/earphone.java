package org.example.Entity;

public class earphone extends NoteBook{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public earphone(String name, String brand, int age, String model) {
        super(name, brand, age);

    }
    public void getearphone() {
        System.out.println(model + "This is model");
    }

    @Override
    public String toString() {
        return "earphone{" +
                "model='" + model + '\'' +
                '}';
    }
}
