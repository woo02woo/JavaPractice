package org.dimigo.oop;

public class Car4 {
    private String company;
    private String model;
    private String color;
    private int maxspeed;
    private int price;

    public Car4(){

    }

    public Car4(String company, String model, String color, int maxspeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
        this.price = price;
    }
    public Car4(String company, String model, String color, int maxspeed) {
        this(company,model,color,maxspeed,0);
    }
    public Car4(String company, String model, String color ){
        this(company,model,color,0,0);
    }


        public String getCompany() {
            return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
