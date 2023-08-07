package se.lexicon;

import java.time.LocalDate;

public class Car {

    // Fields or attributes
    private String id;
    private String brand;
    private String model;
    private String color;
    private Integer year;
    private double mileage;
    private Person owner;

    //...


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Methods
    public void start() {
        System.out.println("The cas is starting.");
    }

    public String carInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car { ");
        stringBuilder.append(" brand:").append(brand);
        stringBuilder.append(" model:").append(model);
        if (owner != null) {
            stringBuilder.append(" owner info:").append(owner.personInfo());
        } else {
            stringBuilder.append(" owner info: - ");
        }
        stringBuilder.append(" } ");


        return stringBuilder.toString();

        //return "Car { brand: " + brand + " , Model: " + model + "}";
    }

    public void drive(double distance) {
        mileage += distance;
    }

    public double getMileage() {
        return mileage;
    }

    public void setBrand(String brand) {
        if (brand == null) throw new IllegalArgumentException("brand was null!");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        if (model == null) throw new IllegalArgumentException("model was null!");
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        if (color == null) this.color = "GRAY";
        else this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(Integer year) {
        if (year == null) this.year = LocalDate.now().getYear();
        else this.year = year;
    }

    public Integer getYear() {
        return year;
    }


    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    //...


}
